/**
 * 
 */
package com.springboot.insurance.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Service;

import com.springboot.insurance.dto.ModuleDto;
import com.springboot.insurance.model.Insurance;
import com.springboot.insurance.service.InsuranceService;

/**
 * @author suman
 *
 */
@Service
public class InsuranceServiceImpl implements InsuranceService {
	
	private static final Logger logger = Logger.getLogger(InsuranceServiceImpl.class);

	private List<Insurance> insuranceList = new ArrayList<>();

	@PostConstruct
	public void getDefaultValue() {
		insuranceList.add(new Insurance("Bike", 0.0, 3000.0, 30));
		insuranceList.add(new Insurance("Jewellery", 500.0, 10000.0, 5));
		insuranceList.add(new Insurance("Electronics", 500.0, 6000.0, 35));
		insuranceList.add(new Insurance("Sports Equipment", 0.0, 20000.0, 30));
	}

	/*
	 * Calculate risk based on module and returns data transfer object
	 * 
	 * */
	@Override
	public ModuleDto calculateRisk(String module, double riskValue) {
		Insurance selectedInsurance = getSelectedInsurance(module);
		logger.info("selectedIns :"+riskValue);
		ModuleDto moduleDto = new ModuleDto();	
		if (selectedInsurance.getCoverageStartValue() <= riskValue
					&& selectedInsurance.getCoverageEndValue() >= riskValue) {
				double riskCalculation = (riskValue * selectedInsurance.getRisk() / 1000);
				moduleDto.setModule(module);
				moduleDto.setRiskCalculation(riskCalculation);
		}
		return moduleDto;
	}

	private Insurance getSelectedInsurance(String module) {
		for (Insurance insurance : insuranceList) {
			if (insurance.getModuleName().equals(module)) {
				return insurance;
			}
		}
		return new Insurance("", 0.0, 0.0, 0);
	}

}
