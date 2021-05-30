package com.resuelve.prueba.service;


import com.resuelve.prueba.dto.Equipo;
import com.resuelve.prueba.dto.Jugador;
import com.resuelve.prueba.constant.Level;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TeamSalaryServiceImpl implements TeamSalaryService {

    private Map<String, List<Jugador>> playerByTeams;

    private Map<String,Double> totalExpectedGoalsByTeams;

    private Map<String,Double> totalGoalsByTeams;


    @Override
    public Equipo calculateSalary(Equipo team) {
        orderPlayersByTeam(team);

        for (Map.Entry<String, List<Jugador>> players : this.playerByTeams.entrySet()) {
            calculateSalaryByTeam(players.getValue(), players.getKey());
        }
        return team;
    }

    private void orderPlayersByTeam(Equipo team) {
        this.playerByTeams = new HashMap<>();
        this.totalExpectedGoalsByTeams = new HashMap<>();
        this.totalGoalsByTeams = new HashMap<>();

        for (Jugador jugador : team.getJugadores()) {
            if (this.playerByTeams.get(jugador.getEquipo()) == null) {
                this.playerByTeams.put(jugador.getEquipo(), new ArrayList<>());
                this.totalExpectedGoalsByTeams.put(jugador.getEquipo(),0D);
                this.totalGoalsByTeams.put(jugador.getEquipo(),0D);
            }

            this.playerByTeams.get(jugador.getEquipo()).add(jugador);

            Integer valueByLevel = Level.LEVELS.get(jugador.getNivel());
            this.totalExpectedGoalsByTeams.put(jugador.getEquipo(),this.totalExpectedGoalsByTeams.get(jugador.getEquipo())+valueByLevel);
            this.totalGoalsByTeams.put(jugador.getEquipo(),this.totalGoalsByTeams.get(jugador.getEquipo())+jugador.getGoles());
        }
    }


    private void calculateSalaryByTeam(List<Jugador> jugadores, String equipo) {
        Double bonoByTeam = this.totalGoalsByTeams.get(equipo)/this.totalExpectedGoalsByTeams.get(equipo);
        for (Jugador jugador : jugadores) {
            Double individualBono = (double)jugador.getGoles()/ (double)Level.LEVELS.get(jugador.getNivel());
            Integer finalSalary = getSalary(jugador.getSueldo(),jugador.getBono(),bonoByTeam,individualBono);
            jugador.setSueldoCompleto(finalSalary);
        }
    }

    private Integer getSalary(Integer sueldo, Integer bono, Double bonoByTeam, Double individualBono) {
        double percentageBono = (bonoByTeam+individualBono)/2;
        Integer result = (int) (bono.floatValue()*percentageBono);
        return sueldo+result;
    }
}
