/**
 * 
 */
package com.springboot.insurance.controller;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.insurance.service.impl.InsuranceServiceImpl;
import com.springboot.insurance.vo.ModularVo;
;

/**
 * @author suman
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(controllers = InsuranceController.class)
public class InsuranceControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockBean
	private InsuranceServiceImpl insuranceService;
	
	@Test
	public void shouldAbleToGetInsuranceDetails() throws Exception {
		ModularVo modular=new ModularVo("Bike", "Coverage 0-3K", 10.0);
		mockMvc.perform(MockMvcRequestBuilders.post("/api/riskCalculation").contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(modular)))		
				.andExpect(content().string(""));
	}
}
