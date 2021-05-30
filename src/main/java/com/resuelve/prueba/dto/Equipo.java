package com.resuelve.prueba.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * DTO for equipo
 *
 */
@Getter
@Setter
public class Equipo {
    private List<Jugador> jugadores;

}
