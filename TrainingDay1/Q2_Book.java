package com.TrainingDay2;

public class Q2_Book {
	private String bookTitle;
	private String author;
	private String ISBN;
	private int numOfCopies;
	
	public Q2_Book(String bookTitle, String author, String ISBN, int numOfCopies) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.ISBN = ISBN;
		if(numOfCopies >= 0) {
			this.numOfCopies = numOfCopies;
		}
		else {
			System.out.println("Invalid quantity");
		}
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public int getNumOfCopies() {
		return numOfCopies;
	}
	
	public void display() {
		System.out.println(bookTitle + "- " + author + "- "+ ISBN + "- " + numOfCopies);
	}
	
	public void increaseBooks(int count) {
		if(count>0) {
			numOfCopies += count;
		}
	}
	
	public boolean decreaseBooks(int count) {
		if(count <= numOfCopies) {
			numOfCopies -= count;
			return true;
		}
		return false;
	}
}
