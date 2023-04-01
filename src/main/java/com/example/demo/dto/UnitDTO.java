package com.example.demo.dto;

import com.example.demo.entity.Brood;

import lombok.Data;

@Data
public class UnitDTO {

    private String name;

    private boolean grand;

    private Brood brood;
    
}
//DTO는 깔때기 같은 친구, 요청자에게 필요없는 정보를 제외하고 보내줄 수 있다