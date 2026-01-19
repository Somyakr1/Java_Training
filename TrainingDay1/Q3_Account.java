package com.TrainingDay2;

public class Q3_Account {
	
	private String name;
	private String accountNumber;
	protected double balance;
	
	public Q3_Account(String name, String accountNumber, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amt) {
		if(amt>0) {
			balance += amt;
			System.out.println("Deposited " + amt + " rupees");
		}
		else {
			System.out.println("Invalid deposit");
		}
	}
	
	public void withdraw(double amt) {
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
}
