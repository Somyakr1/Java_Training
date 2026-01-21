package com.TrainingDay4;

public class Q2_BookCollectionTest {
	
	 public static void main(String[] args) {

	        Q2_Book[] bookArray = {
	            new Q2_Book("Spring Boot", "Sharma"),
	            new Q2_Book("Java Basics", "Raj"),
	            new Q2_Book("Java in Depth", "Mehta")
	        };

	        Q2_BookCollection collection = new Q2_BookCollection("Somya", bookArray);

	        Q2_Book searchBook = new Q2_Book("Java in Depth", "Mehta");
	     
	        System.out.println("Contains 'Java in Depth': " + collection.hasBook(searchBook));

	        collection.sort();

	        System.out.println(collection);
	    }

}
