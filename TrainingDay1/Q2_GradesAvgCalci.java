package com.TrainingDay1;

import java.util.Scanner;

public class Q2_GradesAvgCalci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter no. of students: ");
		int n = scanner.nextInt();
		
//		corner case (if no. of students is 0)
		if(n==0) {
			System.out.println("No student, hence exiting.");
			scanner.close();
			return;
		}
		
		int[] grades = new int[n];
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			while(true) {
				try {
					System.out.print("Enter grade for student: " + (i+1)+" :");
					int grade = scanner.nextInt();
					
					if(grade<0 || grade>100) {
						throw new Exception();
					}
					grades[i] = grade;
					sum+=grade;
					break;
				}catch(Exception e) {
					System.out.println("Invalid grade. Try again");
				}
			}
		}
		double average = (double)sum/n;
		System.out.println("Average:" + average);
		scanner.close();
	}
	
}
