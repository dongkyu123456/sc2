package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Brood;

public interface BroodRepo extends JpaRepository<Brood,Integer> {

}