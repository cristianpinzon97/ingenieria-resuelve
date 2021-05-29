package com.resuelve.prueba.service;


import org.springframework.stereotype.Component;

@Component
public class TeamSalaryServiceImpl implements TeamSalaryService{


    @Override
    public String calculateSalary() {
        return "Salary calculated...";
    }
}
