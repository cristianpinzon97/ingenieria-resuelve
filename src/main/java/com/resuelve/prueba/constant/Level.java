package com.resuelve.prueba.constant;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
/**
 * Constant to manage the levels of a team
 */
public class Level {

    // Declaring the static map
    public static final Map<String, Integer> LEVELS;

    // Instantiating the static map
    static
    {
        LEVELS = new HashMap<>();
        LEVELS.put("A", 5);
        LEVELS.put("B", 10);
        LEVELS.put("C", 15);
        LEVELS.put("Cuauh", 20);
    }

    private Level(){}
}