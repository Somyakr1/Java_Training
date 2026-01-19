package com.TrainingDay2;

import java.util.ArrayList;

public class Q5_PaymentApp {
	public static void main(String[] args) {
		ArrayList<Q5_Payable> p = new ArrayList<>();
		
		p.add(new Q4_SalariedEmployee("Aman", 1, 5000));
		p.add(new Q4_HourlyEmployee("Shraddha", 2, 30, 300));
		p.add(new Q4_ComissionEmployee("Neha", 3, 5000, 10));
		
		p.add(new Q5_Invoice("1", "Mobile Phone", 1, 20000));
		p.add(new Q5_Invoice("2", "Laptop", 2, 60000));
		
		for(Q5_Payable payment: p) {
			System.out.println("Payment amount: "+ payment.getPayment() + " rupees");
		}

	}
}
