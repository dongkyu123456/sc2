package com.example.demo.dto;

import com.example.demo.entity.Brood;
import com.example.demo.entity.Unit;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UnitDTO {

    private String name;

    private boolean grand;

    private Brood brood;
    
    public UnitDTO(Unit units){
        name = units.getName();
        grand = units.getGrand();
        brood = units.getBrood();
    }
}
//DTO는 깔때기 같은 친구, 요청자에게 필요없는 정보를 제외하고 보내줄 수 있다