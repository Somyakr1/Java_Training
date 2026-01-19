package com.TrainingDay2;

public abstract class Q4_Employee implements Q5_Payable{
	private String name;
	private int employeeId;
	
	public Q4_Employee(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	
	public abstract double getPayment();
	
	public String getName() {
		return name;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
}
