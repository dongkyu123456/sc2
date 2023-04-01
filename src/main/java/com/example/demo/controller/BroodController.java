package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UnitService;

@RestController
@RequestMapping({ "/", "" })
public class BroodController {
    // @GetMapping("/{name}")
    // public String name() {
    //     return "name";
    // }
    @GetMapping("/terran")
    private String terran() {
        return "terran";
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
