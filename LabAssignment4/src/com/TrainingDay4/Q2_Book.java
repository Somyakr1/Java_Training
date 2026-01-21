package com.TrainingDay4;

import java.util.Objects;

public class Q2_Book {
	
	private String title;
	private String author;
	
	public Q2_Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    
    @Override
    public String toString() {
        return title + " – " + author;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Q2_Book)) return false;
        Q2_Book book = (Q2_Book) o;
        return title.equalsIgnoreCase(book.title) &&
               author.equalsIgnoreCase(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title.toLowerCase(), author.toLowerCase());
    }


}
