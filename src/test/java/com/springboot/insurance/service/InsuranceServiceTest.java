/**
 * 
 */
package com.springboot.insurance.service;

import org.junit.Assert;
import org.junit.Test;

import com.springboot.insurance.dto.ModuleDto;
import com.springboot.insurance.service.impl.InsuranceServiceImpl;

/**
 * @author suman
 *
 */
public class InsuranceServiceTest {

	InsuranceServiceImpl insuranceService = new InsuranceServiceImpl();

	@Test
	public void calculateRiskTest() {
		insuranceService.getDefaultValue();
		ModuleDto moduleDto = new ModuleDto("Bike", 0.3);
		ModuleDto moduleServiceDto = insuranceService.calculateRisk("Bike", 10.0);
		Assert.assertEquals(moduleDto.getRiskCalculation(), moduleServiceDto.getRiskCalculation());
		Assert.assertEquals(moduleDto.getModule(), moduleServiceDto.getModule());
	}

	@Test
	public void calculateRiskEmptyCheckTest() {
		insuranceService.getDefaultValue();
		ModuleDto moduleDto = new ModuleDto(null, null);
		ModuleDto moduleServiceDto = insuranceService.calculateRisk("", 10.0);
		Assert.assertEquals(moduleDto.getRiskCalculation(), moduleServiceDto.getRiskCalculation());
		Assert.assertEquals(moduleDto.getModule(), moduleServiceDto.getModule());
	}
}
