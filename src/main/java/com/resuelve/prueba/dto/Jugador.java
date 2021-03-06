package com.resuelve.prueba.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * DTO for Jugador
 */
@Getter
@Setter
public class Jugador {
    private String nombre;
    private String nivel;
    private Integer goles;
    private Integer sueldo;
    private Integer bono;
    @JsonProperty(value = "sueldo_completo")
    private Integer sueldoCompleto;
    private String equipo;

}
