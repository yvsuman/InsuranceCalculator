/**
 * 
 */
package com.springboot.insurance.model;

/**
 * @author suman
 *
 */
public class Insurance {

	private String moduleName;
	private Double coverageStartValue;
	private Double coverageEndValue;
	private int risk;

	public Insurance(String moduleName, Double coverageStartValue, Double coverageEndValue, int risk) {
		this.moduleName = moduleName;
		this.coverageStartValue = coverageStartValue;
		this.coverageEndValue = coverageEndValue;
		this.risk = risk;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public Double getCoverageStartValue() {
		return coverageStartValue;
	}

	public void setCoverageStartValue(Double coverageStartValue) {
		this.coverageStartValue = coverageStartValue;
	}

	public int getRisk() {
		return risk;
	}

	public void setRisk(int risk) {
		this.risk = risk;
	}

	public Double getCoverageEndValue() {
		return coverageEndValue;
	}

	public void setCoverageEndValue(Double coverageEndValue) {
		this.coverageEndValue = coverageEndValue;
	}

}
