package SpringJWT_OAuth2.Tut.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "users")
@Entity
public class User {
    private int id;
    @Id
    private String username;
    private String password;
}