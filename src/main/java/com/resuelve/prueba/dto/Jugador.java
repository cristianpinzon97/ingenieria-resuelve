package com.resuelve.prueba.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Jugador {
    private String nombre;
    private String nivel;
    private long goles;
    private long sueldo;
    private long bono;
    @JsonProperty(value = "sueldo_completo")
    private Object sueldoCompleto;
    private String equipo;

}
