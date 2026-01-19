package com.TrainingDay2;

public class Q4_HourlyEmployee extends Q4_Employee{
	private int hoursWorked;
	private double hourlyRate;
	
	public Q4_HourlyEmployee(String name, int id, int hoursWorked, double hourlyRate) {
		super(name, id);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;

	}
	
	@Override
	public double getPayment() {
		return hoursWorked * hourlyRate;
	}
}
