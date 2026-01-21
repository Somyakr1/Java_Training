package com.TrainingDay3;

import java.util.Scanner;

public class Q7_Division {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter 2 integers: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int quotient = a/b;
			System.out.println("The quotient of " + a + "/" + b + " = " + quotient);
		}catch(ArithmeticException e) {
			System.out.println("DivisionByZeroException caught");
		}finally {
			System.out.println("Inside finally block");
		}
	}
}
