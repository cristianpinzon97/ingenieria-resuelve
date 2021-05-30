package com.resuelve.prueba.service;


import com.resuelve.prueba.dto.Equipo;

/**
 * Service for managing team salaries
 */
public interface TeamSalaryService {

    /**
     * Calculates the salary of a Team
     * @param team that the salary will be calculated
     * @return the same team but with the salary calculated
     */
    Equipo calculateSalary(Equipo team);
}
