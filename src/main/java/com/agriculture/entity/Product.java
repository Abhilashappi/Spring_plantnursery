package com.agriculture.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    @Column(length = 1000)
    private String description;
    private Double price;
    private String photoUrl;

    @ManyToOne
    @JoinColumn(name = "plant_id")
    private Plant plant;
}
