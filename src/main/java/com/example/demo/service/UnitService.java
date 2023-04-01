package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.dto.UnitDTO;
import com.example.demo.entity.Brood;
import com.example.demo.entity.BroodType;
import com.example.demo.entity.Unit;
import com.example.demo.repository.UnitRepo;

import jakarta.transaction.Transactional;

@Service
public class UnitService {

    private final UnitRepo unitRepo;

    public UnitService(UnitRepo unitRepo) {
        this.unitRepo = unitRepo;
    }

    /* 유닛 전체 조회 */
    @Transactional
    public List<UnitDTO> readAllUnits() {
        return unitRepo.findByOrderByPkDesc()
                .map(UnitDTO::new)
                .collect(Collectors.toList());
    }

// 테란 유닛 조회
    @Transactional
    public List<UnitDTO> readterranUnits() {
        return unitRepo.findByBrood(BroodType.terran)
                .stream()
                .map(UnitDTO::new)
                .collect(Collectors.toList());
    }

}