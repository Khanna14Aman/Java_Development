package SpringOAuth.SpringOAuthTut.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().authenticated() // All requests require authentication
                )
                .oauth2Login(Customizer.withDefaults())
                .oauth2Login(oauth2 -> oauth2
                        .defaultSuccessUrl("/hello", true) // Redirect to /hello after login
                );// Enable OAuth2 login
        return http.build();
    }
}