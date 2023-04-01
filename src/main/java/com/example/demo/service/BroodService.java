package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.repository.BroodRepo;

// @Service
// public class BroodService {
//     @Autowired
//     private JpaRepository<BroodRepo, Integer> broodRepo;

//     public List<BroodRepo> getBroods() {
//         List<BroodRepo> broods = broodRepo.findAll();
//         return broods;
//     }
// }