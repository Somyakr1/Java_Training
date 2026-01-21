package com.trainingDay5;

public class Q2_Account {
	private double balance;
	
	public Q2_Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
	
	public void addAmount(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount + 
        		" | Balance: " + balance);
    }
	
	public void subtractAmount(double amount) {
        balance -= amount;
        System.out.println(Thread.currentThread().getName()
                + " withdrew: " + amount
                + " | Balance: " + balance);
    }
	
//	Method level synchronization
	
//	public synchronized void addAmount(double amount) {
//	    balance += amount;
//	}
//
//	public synchronized void subtractAmount(double amount) {
//	    balance -= amount;
//	}
	
	
	
	
	
	
//	Block level synchronization
//	
//	public void addAmount(double amount) {
//	    synchronized (this) {
//	        balance += amount;
//	    }
//	}
//
//	public void subtractAmount(double amount) {
//	    synchronized (this) {
//	        balance -= amount;
//	    }
//	}


}
