package com.resuelve.prueba.service;


import com.resuelve.prueba.dto.Equipo;
import org.springframework.stereotype.Component;

@Component
public class TeamSalaryServiceImpl implements TeamSalaryService{


    @Override
    public Equipo calculateSalary(Equipo team) {

        return team;
    }
}
