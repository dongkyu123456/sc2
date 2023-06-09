package com.example.demo.entity;

import jakarta.persistence.Column;

// import javax.validation.constraints.Pattern;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Setter
public class Brood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pk;
    @Column
    private BroodType brood;
}

// public enum BroodType{
//     none, terran, protoss, zerg
// }


// @Pattern(regexp = "^('terran'|'zerg'|'protoss')$")
// private Integer brood;