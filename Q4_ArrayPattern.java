package com.TrainingDay1;

import java.util.Scanner;

public class Q4_ArrayPattern {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Enter no. of rows

		System.out.println("Enter no. of rows: ");
		int rows = sc.nextInt();
		
//		Create 2D array pattern
		
		int[][] pattern = new int[rows][];
		
		for(int i = 0; i<rows; i++) {
			pattern[i] = new int[i+1];
			
			for(int j=0; j<=i; j++) {
				pattern[i][j] = j+1;
			}
		}
		
//		Print pattern
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<pattern[i].length; j++) {
				System.out.print(pattern[i][j]);
			
			if(j<pattern[i].length - 1) {
				System.out.print(" ");
			}
			}
			System.out.println();
		}
		sc.close();
	}
}

