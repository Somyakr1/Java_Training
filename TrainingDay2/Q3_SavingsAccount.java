package com.TrainingDay2;

public class Q3_SavingsAccount extends Q3_Account{
	
	private double interest = 5;
	private double minBalance = 5000;
	
	public Q3_SavingsAccount(String name, String accountNumber, double balance) {
		super(name, accountNumber, balance);
	}
	
	public double getBalance() {
		return balance + (balance*interest/100);
	}
	
	@Override
	public void withdraw(double amt) {
		if(amt<=0) {
			System.out.println("Invalid amount. This amount can not be withdrawn");
		}
		else if(amt>balance) {
			System.out.println("Insufficient balance");
		}
		else if((balance-amt)<minBalance) {
			System.out.println("This amount of" + amt + "can't be withdrawn in order to maintain min balance");
		}
		else {
			balance -= amt;
			System.out.println("Withdrawal of rupees" + amt + "success");
		}
	}
}
