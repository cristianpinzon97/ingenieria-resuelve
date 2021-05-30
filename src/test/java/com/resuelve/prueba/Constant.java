package com.resuelve.prueba;

public class Constant {

    public static final String TEAM_TEST = "{\n" +
            "   \"jugadores\" : [  \n" +
            "      {  \n" +
            "         \"nombre\":\"Juan Perez\",\n" +
            "         \"nivel\":\"C\",\n" +
            "         \"goles\":10,\n" +
            "         \"sueldo\":50000,\n" +
            "         \"bono\":25000,\n" +
            "         \"sueldo_completo\":null,\n" +
            "         \"equipo\":\"rojo\"\n" +
            "      },\n" +
            "      {  \n" +
            "         \"nombre\":\"EL Cuauh\",\n" +
            "         \"nivel\":\"Cuauh\",\n" +
            "         \"goles\":30,\n" +
            "         \"sueldo\":100000,\n" +
            "         \"bono\":30000,\n" +
            "         \"sueldo_completo\":null,\n" +
            "         \"equipo\":\"azul\"\n" +
            "      },\n" +
            "      {  \n" +
            "         \"nombre\":\"Cosme Fulanito\",\n" +
            "         \"nivel\":\"A\",\n" +
            "         \"goles\":7,\n" +
            "         \"sueldo\":20000,\n" +
            "         \"bono\":10000,\n" +
            "         \"sueldo_completo\":null,\n" +
            "         \"equipo\":\"azul\"\n" +
            "\n" +
            "      },\n" +
            "      {  \n" +
            "         \"nombre\":\"El Rulo\",\n" +
            "         \"nivel\":\"B\",\n" +
            "         \"goles\":9,\n" +
            "         \"sueldo\":30000,\n" +
            "         \"bono\":15000,\n" +
            "         \"sueldo_completo\":null,\n" +
            "         \"equipo\":\"rojo\"\n" +
            "\n" +
            "      }\n" +
            "   ]\n" +
            "}";

    public static String TEAM_TEST_RESULT = "{\n" +
            "    \"jugadores\": [\n" +
            "        {\n" +
            "            \"nombre\": \"Juan Perez\",\n" +
            "            \"nivel\": \"C\",\n" +
            "            \"goles\": 10,\n" +
            "            \"sueldo\": 50000,\n" +
            "            \"bono\": 25000,\n" +
            "            \"equipo\": \"rojo\",\n" +
            "            \"sueldo_completo\": 67833\n" +
            "        },\n" +
            "        {\n" +
            "            \"nombre\": \"EL Cuauh\",\n" +
            "            \"nivel\": \"Cuauh\",\n" +
            "            \"goles\": 30,\n" +
            "            \"sueldo\": 100000,\n" +
            "            \"bono\": 30000,\n" +
            "            \"equipo\": \"azul\",\n" +
            "            \"sueldo_completo\": 144700\n" +
            "        },\n" +
            "        {\n" +
            "            \"nombre\": \"Cosme Fulanito\",\n" +
            "            \"nivel\": \"A\",\n" +
            "            \"goles\": 7,\n" +
            "            \"sueldo\": 20000,\n" +
            "            \"bono\": 10000,\n" +
            "            \"equipo\": \"azul\",\n" +
            "            \"sueldo_completo\": 34400\n" +
            "        },\n" +
            "        {\n" +
            "            \"nombre\": \"El Rulo\",\n" +
            "            \"nivel\": \"B\",\n" +
            "            \"goles\": 9,\n" +
            "            \"sueldo\": 30000,\n" +
            "            \"bono\": 15000,\n" +
            "            \"equipo\": \"rojo\",\n" +
            "            \"sueldo_completo\": 42450\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    // avoid instances of this clases
    private Constant(){}


}
