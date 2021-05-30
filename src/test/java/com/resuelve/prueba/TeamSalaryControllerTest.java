package com.resuelve.prueba;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.resuelve.prueba.dto.Equipo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.resuelve.prueba.Constant;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
class TeamSalaryControllerTest {

	@Autowired
	private MockMvc mockMvc;



	@Test
	void testCalculatingSalary() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		Equipo team = objectMapper.readValue(Constant.TEAM_TEST, Equipo.class);
		mockMvc.perform( MockMvcRequestBuilders
				.post("/v1/resuelve-fc/salaries")
				.content(Constant.TEAM_TEST)
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json(Constant.TEAM_TEST));
	}

}
