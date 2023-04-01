package com.example.demo.entity;

// import javax.validation.constraints.Pattern;

import jakarta.persistence.Entity;
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
    private BroodType brood;
}

// public enum BroodType{
//     none, terran, protoss, zerg
// }


// @Pattern(regexp = "^('terran'|'zerg'|'protoss')$")
// private Integer brood;