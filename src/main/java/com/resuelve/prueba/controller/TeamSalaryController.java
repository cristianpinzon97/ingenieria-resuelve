package com.resuelve.prueba.controller;

import com.resuelve.prueba.service.TeamSalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/resuelve-fc/salaries")
public class TeamSalaryController {

    @Autowired
    TeamSalaryService teamSalaryService;

    @PostMapping()
    public ResponseEntity<String> calculateTeamSalary(){
        return ResponseEntity.ok(this.teamSalaryService.calculateSalary());
    }
}
