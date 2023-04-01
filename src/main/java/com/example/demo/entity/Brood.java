package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Brood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pk;

    @Enumerated(EnumType.ORDINAL)
    private BroodType brood;
}


// @Pattern(regexp = "^('terran'|'zerg'|'protoss')$")
// private String brood;