/**
 * 
 */
package com.springboot.insurance.service;

import com.springboot.insurance.dto.ModuleDto;

/**
 * @author suman
 *
 */
public interface InsuranceService {
	
	ModuleDto calculateRisk(String module, double riskValue);

}
