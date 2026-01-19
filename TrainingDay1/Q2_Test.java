package com.TrainingDay2;

public class Q2_Test {
	public static void main(String[] args) {
		Q2_Book b1 = new Q2_Book("Head First", "Kathy Sierra", "1234567890987", 10);
		Q2_Book b2 = new Q2_Book("Head First", "Kathy Sierra", "1234567890987", -1);
		
		b1.display();
		b2.display();
	}
}
