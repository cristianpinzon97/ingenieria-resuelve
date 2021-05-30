package com.resuelve.prueba.controller;

import com.resuelve.prueba.dto.Equipo;
import com.resuelve.prueba.service.TeamSalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest Controller for managing team salaries
 */
@RestController
@RequestMapping(value = "/v1/resuelve-fc/salaries")
public class TeamSalaryController {

    @Autowired
    TeamSalaryService teamSalaryService;

    @PostMapping()
    /**
     * Post method for calculating team salary
     * @param team that the salary will be calculated
     * @Return team with
     */
    public ResponseEntity<Equipo> calculateTeamSalary(@RequestBody Equipo team){
        return ResponseEntity.ok(this.teamSalaryService.calculateSalary(team));
    }
}
