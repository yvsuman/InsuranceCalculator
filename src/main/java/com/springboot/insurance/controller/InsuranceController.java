/**
 * 
 */
package com.springboot.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.insurance.dto.ModuleDto;
import com.springboot.insurance.service.impl.InsuranceServiceImpl;
import com.springboot.insurance.vo.ModularVo;

/**
 * @author suman
 *
 */
@RestController
@RequestMapping(path = "/api")
public class InsuranceController {

	@Autowired
	public InsuranceServiceImpl insuranceService;
    
	/*
	 * @RequestBody accepts value object of module & risk Value
	 * */
	@PostMapping(path = "/riskCalculation")
	public ResponseEntity<ModuleDto> calculateRisk(@RequestBody ModularVo modularVo) {
		return ResponseEntity.ok(insuranceService.calculateRisk(modularVo.getModule(), modularVo.getRisk()));
	}

}
