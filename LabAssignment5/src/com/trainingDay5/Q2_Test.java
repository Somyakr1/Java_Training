package com.trainingDay5;

public class Q2_Test {
	public static void main(String[] args) throws InterruptedException {

        Q2_Account account = new Q2_Account(10000);

        Thread bankThread = new Thread(new Q2_Bank(account), "Bank-Thread");
        Thread companyThread = new Thread(new Q2_Company(account), "Company-Thread");

        bankThread.start();
        companyThread.start();

        bankThread.join();
        companyThread.join();

        System.out.println("Final Balance: " + account.getBalance());
    }
}
