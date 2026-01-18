# Spring Security Tutorial - Architecture Overview

## System Architecture Diagram

```mermaid
graph TB
    subgraph "Client Layer"
        C[Client Application]
    end
    
    subgraph "Spring Security Layer"
        SF[SecurityFilterChain]
        DAP[DaoAuthenticationProvider]
        BCE[BCryptPasswordEncoder]
    end
    
    subgraph "Controller Layer"
        UC[UserController]
        SC[StudentController]
    end
    
    subgraph "Service Layer"
        US[UserService]
        MUDS[MyUserDetailsService]
    end
    
    subgraph "Model Layer"
        U[User Entity]
        UP[UserPrincipal]
        S[Student Model]
    end
    
    subgraph "Repository Layer"
        UR[UserRepo]
    end
    
    subgraph "Database Layer"
        DB[(Database)]
    end
    
    C --> SF
    SF --> DAP
    DAP --> MUDS
    DAP --> BCE
    SF --> UC
    SF --> SC
    UC --> US
    US --> UR
    MUDS --> UR
    UR --> DB
    MUDS --> UP
    UP --> U
    US --> U
```

## Component Interaction Flow

```mermaid
flowchart TD
    A[HTTP Request] --> B{Authentication Required?}
    B -->|Yes| C[SecurityFilterChain]
    B -->|No - /register| D[UserController]
    
    C --> E[DaoAuthenticationProvider]
    E --> F[MyUserDetailsService]
    F --> G[UserRepo]
    G --> H[(Database)]
    
    H --> I[User Entity]
    I --> J[UserPrincipal]
    J --> K[Authentication Success]
    
    K --> L{Authorized?}
    L -->|Yes| M[Controller Layer]
    L -->|No| N[401 Unauthorized]
    
    M --> O[Service Layer]
    O --> P[Repository Layer]
    P --> H
    
    D --> Q[UserService]
    Q --> R[BCryptPasswordEncoder]
    R --> S[Encoded Password]
    S --> G
```

## Security Filter Chain Configuration

The application uses a custom security configuration with the following key features:

### Authentication Flow
1. **HTTP Basic Authentication**: Credentials sent in Authorization header
2. **Stateless Sessions**: No server-side session storage
3. **Database Authentication**: Users stored in database with BCrypt passwords
4. **Custom UserDetailsService**: Loads user data from database

### Authorization Rules
- All endpoints except `/register` require authentication
- Single role "USER" assigned to all authenticated users
- Custom authorization logic in `UserService.findUserById()`

## Key Security Components

### 1. SecurityConfig
- Configures security filter chain
- Disables CSRF for stateless API
- Sets up HTTP Basic authentication
- Configures BCrypt password encoder

### 2. MyUserDetailsService
- Implements Spring Security's UserDetailsService
- Loads user from database by username
- Returns UserPrincipal wrapper

### 3. UserPrincipal
- Implements UserDetails interface
- Wraps User entity for Spring Security
- Provides user authorities and account status

### 4. DaoAuthenticationProvider
- Authenticates users against database
- Uses BCrypt for password verification
- Integrates with custom UserDetailsService

## Data Flow Summary

1. **Registration**: Client → UserController → UserService → BCrypt → UserRepo → Database
2. **Authentication**: Client → SecurityFilterChain → DaoAuthenticationProvider → MyUserDetailsService → UserRepo → Database
3. **Authorization**: SecurityContextHolder → UserPrincipal → User verification
4. **Protected Resources**: Authenticated requests → Controllers → Services → Repositories → Database

This architecture provides a secure, stateless REST API with database-backed authentication and proper password encryption.
