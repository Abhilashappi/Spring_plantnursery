package com.agriculture.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")  // ✅ Avoids conflicts with SQL reserved word 'user'
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)  // ❌ Removed unique = true
    private String password;
}
