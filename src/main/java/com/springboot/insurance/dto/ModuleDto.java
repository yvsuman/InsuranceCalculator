/**
 * 
 */
package com.springboot.insurance.dto;

/**
 * @author suman
 *
 */
public class ModuleDto {

	private String module;

	private Double riskCalculation;
	
	public ModuleDto(){}

	public ModuleDto(String module, Double riskCalculation) {
		super();
		this.module = module;
		this.riskCalculation = riskCalculation;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public Double getRiskCalculation() {
		return riskCalculation;
	}

	public void setRiskCalculation(Double riskCalculation) {
		this.riskCalculation = riskCalculation;
	}

}
