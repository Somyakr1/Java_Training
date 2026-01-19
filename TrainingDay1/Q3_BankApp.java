package com.TrainingDay2;

public class Q3_BankApp {
	public static void main(String[] args) {
		
//		Savings Account
		System.out.println("SAVINGS ACCOUNT");
		Q3_SavingsAccount acc1 = new Q3_SavingsAccount("Somya", "2000300388", 10000);
		
		acc1.deposit(1000);
		acc1.withdraw(2000);
		System.out.println("Balance after interest: " + acc1.getBalance());
		
		acc1.withdraw(7000);
		
		System.out.println();
		
//		Current Account
		System.out.println("CURRENT ACCOUNT");
		Q3_CurrentAccount acc2 = new Q3_CurrentAccount("Somya", "2000300388", 10000, "978758456", 3000);
		acc2.deposit(1000);
		acc2.withdraw(7000);
		System.out.println("Current Balance: " + acc2.getBalance());
		acc2.withdraw(3000);
		}
}
