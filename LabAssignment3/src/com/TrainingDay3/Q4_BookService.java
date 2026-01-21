package com.TrainingDay3;

import java.io.*;
import java.util.LinkedList;

public class Q4_BookService {
	private LinkedList<Q4_Book> book = new LinkedList<>();
	
	public void readBooks(String fileName) {

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {

                String[] data = line.split(":");

                int id = Integer.parseInt(data[0]);
                String isbn = data[1];
                String title = data[2];
                String author = data[3];
                double price = Double.parseDouble(data[4]);

                book.add(new Q4_Book(id, isbn, title, author, price));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public Q4_Book searchBook(int id) {

        for (Q4_Book b : book) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }
	
	public void sellBook(String isbn, int noOfCopies)
            throws Q4_NotSufficientBookException {

        for (Q4_Book b : book) {
            if (b.getIsbn().equals(isbn)) {

                if (b.getQuantity() < noOfCopies) {
                    throw new Q4_NotSufficientBookException(
                            "Not enough copies available");
                }

                b.decreaseQuantity(noOfCopies);
                System.out.println("Sold " + noOfCopies + " copies of " + isbn);
                return;
            }
        }
        System.out.println("Book not found");
    }
	
	public void purchaseBook(String isbn, int noOfCopies) {

        for (Q4_Book b : book) {
            if (b.getIsbn().equals(isbn)) {
                b.increaseQuantity(noOfCopies);
                System.out.println("Purchased " + noOfCopies + " copies of " + isbn);
                return;
            }
        }
        System.out.println("Book not found");
    }
	
	public void displayAllBooks() {
        for (Q4_Book b : book) {
            System.out.println(book);
        }
}
}
