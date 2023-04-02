package com.example.demo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UnitDTO;
import com.example.demo.entity.BroodType;
import com.example.demo.repository.UnitRepo;

@RestController
@RequestMapping({ "/", "" })
public class BroodController {

    private final UnitRepo unitRepo;

    public BroodController(UnitRepo unitRepo) {
        this.unitRepo = unitRepo;
    }

    @GetMapping("/all")
    public List<UnitDTO> getAllUnits() {
        return unitRepo.findAll().stream().map(UnitDTO::new).collect(Collectors.toList());
    }

    @GetMapping("/terran")
    public List<UnitDTO> getTerranUnits() {
        return unitRepo.findByBroodBrood(BroodType.terran).stream().map(UnitDTO::new).collect(Collectors.toList());
    }

    @GetMapping("/terran/grand")
    private List<UnitDTO> getTerranGrand() {
        return unitRepo.findByBroodBroodAndGrand(BroodType.terran, true).stream().map(UnitDTO::new)
                .collect(Collectors.toList());
    }

    @GetMapping("/terran/sky")
    private List<UnitDTO> getTerranSky() {
        return unitRepo.findByBroodBroodAndGrand(BroodType.terran, false).stream().map(UnitDTO::new)
                .collect(Collectors.toList());
    }

    @GetMapping("/protoss")
    public List<UnitDTO> getProtossUnits() {
        return unitRepo.findByBroodBrood(BroodType.protoss).stream().map(UnitDTO::new).collect(Collectors.toList());
    }

    @GetMapping("/protoss/grand")
    private List<UnitDTO> getProtossGrand() {
        return unitRepo.findByBroodBroodAndGrand(BroodType.protoss, true).stream().map(UnitDTO::new)
                .collect(Collectors.toList());
    }

    @GetMapping("/protoss/sky")
    private List<UnitDTO> getProtossSky() {
        return unitRepo.findByBroodBroodAndGrand(BroodType.protoss, false).stream().map(UnitDTO::new)
                .collect(Collectors.toList());
    }

    @GetMapping("/zerg")
    public List<UnitDTO> getZergUnits() {
        return unitRepo.findByBroodBrood(BroodType.zerg).stream().map(UnitDTO::new).collect(Collectors.toList());
    }

    @GetMapping("/zerg/grand")
    private List<UnitDTO> getZergGrand() {
        return unitRepo.findByBroodBroodAndGrand(BroodType.zerg, true).stream().map(UnitDTO::new)
                .collect(Collectors.toList());
    }

    @GetMapping("/zerg/sky")
    private List<UnitDTO> getZergSky() {
        return unitRepo.findByBroodBroodAndGrand(BroodType.zerg, false).stream().map(UnitDTO::new)
                .collect(Collectors.toList());
    }

    @GetMapping("/grand")
    private List<UnitDTO> getGrand() {
        return unitRepo.findByGrand(true).stream().map(UnitDTO::new).collect(Collectors.toList());
    }

    @GetMapping("/sky")
    private List<UnitDTO> getSky() {
        return unitRepo.findByGrand(false).stream().map(UnitDTO::new).collect(Collectors.toList());
    }

    @GetMapping("/unit/{name}")
    private List<UnitDTO> unit(@PathVariable(required = false) String name) {
        return unitRepo.findByName(name).stream().map(UnitDTO::new).collect(Collectors.toList());

    }
}
