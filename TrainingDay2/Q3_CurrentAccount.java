package com.TrainingDay2;

public class Q3_CurrentAccount extends Q3_Account{
	private String tradeLicenseNumber;
	private double overdraft;
	
	public Q3_CurrentAccount(String name, String accountNumber, double balance, String tradeLicenseNumber,
			double overdraft) {
		super(name, accountNumber, balance);
		this.tradeLicenseNumber = tradeLicenseNumber;
		this.overdraft = overdraft;
	}
	
	public double getBalance() {
		return balance;
	}
	
	@Override
	public void withdraw(double amt) {
		if(amt<=0) {
			System.out.println("Invalid amount. This amount can not be withdrawn");
		}
		else if(amt<balance+overdraft) {
			balance -= amt;
			System.out.println("Withdrawal of rupees" + amt + "success");
		}
		else {
			System.out.println("Withdrawal exceeds overdraft limit");
		}
	}
}
