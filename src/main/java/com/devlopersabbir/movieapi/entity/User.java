package com.devlopersabbir.movieapi.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.UUID;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true, nullable = false, length = 36)
    private String uuid;
    private String username;
    private String name;
    private String email;
    private String password;
    private String roles;

    private PasswordEncoder passwordEncoder;
    @PrePersist
    public void beforeInsert(){
        if(this.uuid == null){
            this.uuid = UUID.randomUUID().toString();
        }
        // encode password
        this.password = passwordEncoder.encode(this.password);
    }
}
