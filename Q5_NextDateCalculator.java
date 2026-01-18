package com.TrainingDay1;

import java.util.Scanner;

public class Q5_NextDateCalculator {
	
	static boolean isLeapYear(int year) {
		return ((year%4==0 && year%100!=0) || (year%400!=0));
	}
	
	static boolean isValidDate(int day, int month, int year) {
		if(year<=0 || month<1 || month>12) {
			return false;
		}
		
		int[] daysInMonth = {31, isLeapYear(year)?29:28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(day<1 || day>daysInMonth[month-1]) {
			return false;
		}
		
		return true;
	}
	
	static int[] getNextDate(int day, int month, int year) {
		
		int[] daysInMonth = {31, isLeapYear(year)?29:28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		day++;
		
		if(day>daysInMonth[month-1]) {
			day = 1;
			month++;
			
			if(month>12) {
				month = 1;
				year++;
			}
		}
		return new int[] {day, month, year};
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter day: ");
		int day = sc.nextInt();
		
		System.out.print("Enter month: ");
		int month = sc.nextInt();
		
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		
		if(!isValidDate(day, month, year)) {
			System.out.println("Invalid date entered.");
		}
		
		System.out.println("Today: " + day + "/" + month + "/" + year);
		
		int next[] = getNextDate(day, month, year);
		
		System.out.println("Next Date: " + next[0] + "/" + next[1] + "/" + next[2]);
		
		sc.close();
		}
}
