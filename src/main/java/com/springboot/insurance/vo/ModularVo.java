/**
 * 
 */
package com.springboot.insurance.vo;

/**
 * @author suman
 *
 */
public class ModularVo {

	private String module;
	private String coverage;
	private double risk;	
	
	public ModularVo(){}

	public ModularVo(String module, String coverage, double risk) {
		this.module = module;
		this.coverage = coverage;
		this.risk = risk;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public double getRisk() {
		return risk;
	}

	public void setRisk(double risk) {
		this.risk = risk;
	}

	public String getCoverage() {
		return coverage;
	}

	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

}
