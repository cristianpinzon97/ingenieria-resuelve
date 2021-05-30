package com.resuelve.prueba.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
/**
 * DTO for equipo
 *
 */
public class Equipo {
    private List<Jugador> jugadores;

}
