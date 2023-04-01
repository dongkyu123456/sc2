package com.example.demo.repository;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BroodType;
import com.example.demo.entity.Unit;

public interface UnitRepo extends JpaRepository<Unit,Integer> {
    Stream<Unit> findByOrderByPkDesc();
    // Stream<Unit> findByBroodType(BroodType enumType);
}