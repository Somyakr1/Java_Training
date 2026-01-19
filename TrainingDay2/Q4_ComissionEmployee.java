package com.TrainingDay2;

public class Q4_ComissionEmployee extends Q4_Employee{
	private double comissionRate;
	private double totalSales;
	
	public Q4_ComissionEmployee(String name, int id, double comissionRate, double totalSales) {
		super(name, id);
		this.comissionRate = comissionRate;
		this.totalSales = totalSales;
	}
	
	@Override
	public double getPayment() {
		return (comissionRate * totalSales);
	}
}
