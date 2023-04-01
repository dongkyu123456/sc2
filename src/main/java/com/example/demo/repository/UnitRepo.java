package com.example.demo.repository;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BroodType;
import com.example.demo.entity.Unit;

public interface UnitRepo extends JpaRepository<Unit,Integer> {
    Stream<Unit> findByOrderByPkDesc();
    List<Unit> findByBroodBrood(BroodType broodType);
    List<Unit> findByGrand(Boolean grand);

}