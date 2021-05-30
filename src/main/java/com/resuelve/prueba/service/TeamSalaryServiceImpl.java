package com.resuelve.prueba.service;


import com.resuelve.prueba.dto.Equipo;
import com.resuelve.prueba.dto.Jugador;
import com.resuelve.prueba.constant.Level;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Service Implementation for {@link TeamSalaryService}
 */
@Component
public class TeamSalaryServiceImpl implements TeamSalaryService {

    private Map<String, List<Jugador>> playersByTeams;

    private Map<String,Double> totalExpectedGoalsByTeams;

    private Map<String,Double> totalGoalsByTeams;


    /**
     * Calculates the salary of a Team
     * @param team that the salary will be calculated
     * @return the same team but with the salary calculated
     */
    @Override
    public Equipo calculateSalary(Equipo team) {
        orderPlayersByTeam(team);

        for (Map.Entry<String, List<Jugador>> players : this.playersByTeams.entrySet()) {
            calculateSalaryByTeam(players.getValue(), players.getKey());
        }
        return team;
    }

    /**
     * Orders the players and calculates their total and expected goals by team
     * @param team that contains the collection of players
     */
    private void orderPlayersByTeam(Equipo team) {
        this.playersByTeams = new HashMap<>();
        this.totalExpectedGoalsByTeams = new HashMap<>();
        this.totalGoalsByTeams = new HashMap<>();

        for (Jugador jugador : team.getJugadores()) {
            if (this.playersByTeams.get(jugador.getEquipo()) == null) {
                this.playersByTeams.put(jugador.getEquipo(), new ArrayList<>());
                this.totalExpectedGoalsByTeams.put(jugador.getEquipo(),0D);
                this.totalGoalsByTeams.put(jugador.getEquipo(),0D);
            }

            this.playersByTeams.get(jugador.getEquipo()).add(jugador);

            Integer valueByLevel = Level.LEVELS.get(jugador.getNivel());
            this.totalExpectedGoalsByTeams.put(jugador.getEquipo(),this.totalExpectedGoalsByTeams.get(jugador.getEquipo())+valueByLevel);
            this.totalGoalsByTeams.put(jugador.getEquipo(),this.totalGoalsByTeams.get(jugador.getEquipo())+jugador.getGoles());
        }
    }


    /**
     * Calculates the salary by team
     * @param jugadores collection of players
     * @param equipo team that those players belong to
     */
    private void calculateSalaryByTeam(List<Jugador> jugadores, String equipo) {
        Double bonoByTeam = this.totalGoalsByTeams.get(equipo)/this.totalExpectedGoalsByTeams.get(equipo);
        for (Jugador jugador : jugadores) {
            Double individualBono = (double)jugador.getGoles()/ (double)Level.LEVELS.get(jugador.getNivel());
            Integer finalSalary = getSalary(jugador.getSueldo(),jugador.getBono(),bonoByTeam,individualBono);
            jugador.setSueldoCompleto(finalSalary);
        }
    }

    /**
     * Gets the salary of a player
     * @param sueldo basic salary of the player
     * @param bono basic bonus salary of the player
     * @param bonoByTeam percentage of bonus by team
     * @param individualBono percentage of bonus by player
     * @return the total salary of a player
     */
    private Integer getSalary(Integer sueldo, Integer bono, Double bonoByTeam, Double individualBono) {
        double percentageBono = (bonoByTeam+individualBono)/2;
        Integer result = (int) (bono*percentageBono);
        return sueldo+result;
    }
}
