package com.example.library.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEST")
public class Test {
	@Id
	private int testId;
	private String testName;
	private String testPlan;
	private String testMock;
	private String testVariable;
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getTestPlan() {
		return testPlan;
	}
	public void setTestPlan(String testPlan) {
		this.testPlan = testPlan;
	}
	public String getTestMock() {
		return testMock;
	}
	public void setTestMock(String testMock) {
		this.testMock = testMock;
	}
	public String getTestVariable() {
		return testVariable;
	}
	public void setTestVariable(String testVariable) {
		this.testVariable = testVariable;
	}
	
	

}
