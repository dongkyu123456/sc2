package com.example.demo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UnitDTO;
import com.example.demo.entity.BroodType;
import com.example.demo.repository.UnitRepo;



@RestController
@RequestMapping({ "/", "" })
public class BroodController {

    private final UnitRepo unitRepo;
    public BroodController(UnitRepo unitRepo){
        this.unitRepo = unitRepo;
    }


    @GetMapping("/all")
    public List<UnitDTO> getAllUnits() {
        return unitRepo.findAll().stream().map(UnitDTO::new).collect(Collectors.toList());
    }

    @GetMapping("/terran")
    public List<UnitDTO> getTerranUnits() {
        return unitRepo.findByBrood(BroodType.terran).stream().map(UnitDTO::new).collect(Collectors.toList());
    }

    @GetMapping("/terran/grand")
    private String terranGrand() {
        return "terran/grand";
    }
    @GetMapping("/terran/sky")
    private String terranSky() {
        return "terran/sky";
    }
    @GetMapping("/protoss")
    public String protoss() {
        return "protoss";
    }
    @GetMapping("/protoss/grand")
    private String protossGrand() {
        return "protoss/grand";
    }
    @GetMapping("/protoss/sky")
    private String protossSky() {
        return "protoss/sky";
    }

    @GetMapping("/zerg")
    public String zerg() {
        return "zerg";
    }
    @GetMapping("/zerg/grand")
    private String zergGrand() {
        return "zerg/grand";
    }
    @GetMapping("/zerg/sky")
    private String zergSky() {
        return "zerg/sky";
    }

    @GetMapping("/grand")
    public String grand() {
        return "grand";
    }
    @GetMapping("/sky")
    public String sky() {
        return "sky";
    }
    @GetMapping("/unit")
    public String unit() {
        return "unit";
    }
}
