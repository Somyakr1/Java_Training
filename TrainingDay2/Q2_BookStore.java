package com.TrainingDay2;

import java.util.Scanner;

public class Q2_BookStore {
	public Q2_Book[] books = new Q2_Book[10];
	private int size = 0;
	private Scanner sc = new Scanner(System.in);
	
	public void sell(String title, int count) {
		for(int i =0; i<size; i++) {
			if(books[i].getBookTitle().equalsIgnoreCase(title)) {
				if(books[i].decreaseBooks(count)) {
					System.out.println("Book sold");
				}
				else {
					System.out.println("Not enough stock");
				}
				return;
			}
		}
		System.out.println("Book not found");
	}
		
		public void order(String isbn, int count) {
			for(int i=0; i<size; i++) {
				if(books[i].getISBN().equals(isbn)) {
					books[i].increaseBooks(count);
					System.out.println("Stock updated");
					return;
				}
			}
			if(size>=10) {
				System.out.println("Bookstore is full, Can not add new books");
				return;
			}
			
			System.out.println("Enter book title: ");
			String title = sc.nextLine();
			
			System.out.println("Enter author name: ");
			String author = sc.nextLine();
			
			books[size] = new Q2_Book(title, author, isbn, count);
			size++;
			
			System.out.println("New book added");
	}
		
		public void display() {
			if(size==0) {
				System.out.println("No book available");
				return;
			}
			System.out.println("\nBook List");
			for(int i=0; i<size; i++) {
				books[i].display();
			}
		}
}
