package com.TrainingDay1;

import java.util.Scanner;

public class Q3_ArrayCopy {
	public static int[] copyOf(int[] array) {
//		creating a new array
		int[] copy = new int[array.length];
		
//		return an empty array if the size of the array is zero
		if(array.length==0) {
			return copy;
		}
		
//		Copying the elements to new array
		int size = array.length;
		for(int i=0; i<size; i++) {
			copy[i] = array[i];
		}
		return copy;
	}
	
	public static void main(String[] args) {
		
//		Input size of the array
		System.out.println("Enter size of array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] original = new int[n];
		System.out.println("Enter " + n + " elements");
		
//		Input the array
		for(int i=0; i<n; i++) {
			original[i] = sc.nextInt();
		}
		
//		Creating a copy array
		int[] copy1 = copyOf(original);
		
//		Printing reference of both the arrays to show the difference
		System.out.println("Reference of original array: " + original);
		System.out.println("Reference of copied array: " + copy1);
		
//		Modifying copied array
		
		if(n!=0) {
			while(true){
				try {
					System.out.println("Enter the index at which you want to modify the copied array: ");
					int modifyIndex = sc.nextInt();
					if(modifyIndex < 0 || modifyIndex > n-1) {
						throw new Exception();
					}
					System.out.println("Enter the element: ");
					copy1[modifyIndex] = sc.nextInt();
					break;
				}catch(Exception e){
					System.out.println("Enter a number between 0 and " + (n-1));
					sc.nextLine();
				}
			  }
				
//				Printing the original and the copied arrays after modification 
				System.out.println("Original array: ");
				for(int num: original) {
					System.out.print(num + " ");
				}
				
				System.out.println();
				System.out.println("Copied array: ");
				for(int num: copy1) {
					System.out.print(num + " ");
				}
		}
		
		sc.close();
	}
}
