package com.resuelve.prueba.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Jugador {
    private String nombre;
    private String nivel;
    private Long goles;
    private Long sueldo;
    private Long bono;
    @JsonProperty(value = "sueldo_completo")
    private Long sueldoCompleto;
    private String equipo;

}
