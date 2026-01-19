package com.TrainingDay2;

public class Q2_BookStoreTest {
	public static void main(String[] args) {
		Q2_BookStore store = new Q2_BookStore();
		store.order("111", 5);
		store.order("222", 3);
		store.display();
		
		store.sell("Head First", 2);
		store.sell("Effective Java", 1);
		store.display();
	}
}
