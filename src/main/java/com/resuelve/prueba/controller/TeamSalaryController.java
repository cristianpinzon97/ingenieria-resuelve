package com.resuelve.prueba.controller;

import com.resuelve.prueba.dto.Equipo;
import com.resuelve.prueba.service.TeamSalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/resuelve-fc/salaries")
public class TeamSalaryController {

    @Autowired
    TeamSalaryService teamSalaryService;

    @PostMapping()
    public ResponseEntity<Equipo> calculateTeamSalary(@RequestBody Equipo team){
        return ResponseEntity.ok(this.teamSalaryService.calculateSalary(team));
    }
}
