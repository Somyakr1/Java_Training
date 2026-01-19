package com.TrainingDay2;

public class Q4_SalariedEmployee extends Q4_Employee {
	private double weeklySalary;
	
	public Q4_SalariedEmployee(String name, int id, double weeklySalary) {
		super(name, id);
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public double getPayment() {
		return weeklySalary;
	}
}
