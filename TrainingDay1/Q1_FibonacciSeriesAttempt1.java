package com.TrainingDay1;

public class Q1_FibonacciSeriesAttempt1 {
	public static void main(String[] args) {
		long[] arr = new long[20];
		arr[0] = 0;
		arr[1] = 1;
		long sum = arr[0]+arr[1];
		for(int it = 2; it<20; it++) {
			arr[it] = arr[it-1] + arr[it-2];
			sum += arr[it];
		}
		
		for(long it: arr) {
			System.out.print(it + " ");
		}
		double avg = (double)sum/20;
		System.out.println("\nAverage: " + avg);
	}
}
