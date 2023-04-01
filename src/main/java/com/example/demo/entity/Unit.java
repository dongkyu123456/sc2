package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Getter
@Entity
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pk;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Boolean grand;
    
    @ManyToOne
    @JoinColumn(name = "brood")
    private Brood brood;
}
