package com.TrainingDay3;

public class Q4_Test {
	public static void main(String[] args) {

        Q4_BookService service = new Q4_BookService();

        service.readBooks("books.txt");

        service.displayAllBooks();
        System.out.println();

        Q4_Book book = service.searchBook(121);
        if (book != null) {
            System.out.println("Book found: " + book);
        } else {
            System.out.println("Book not found");
        }

        System.out.println();

        try {
            service.sellBook("A234", 5);
        } catch (Q4_NotSufficientBookException e) {
            System.out.println(e.getMessage());
        }

        service.purchaseBook("A234", 3);

        System.out.println("\nUpdated Book List:");
        service.displayAllBooks();
    }
}
