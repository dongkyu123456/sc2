package com.example.demo.repository;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Brood;
import com.example.demo.entity.Unit;

public interface UnitRepo extends JpaRepository<Unit,Integer> {
    Stream<Unit> findByOrderByPkDesc();
    List<Unit> findByBrood(Enum broodtype);
}