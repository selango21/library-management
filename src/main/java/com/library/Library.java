package com.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\n--- Book List ---");

        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void issueBook(int id) {

        for (Book book : books) {

            if (book.getId() == id) {

                if (book.isAvailable()) {
                    book.issueBook();
                    System.out.println("Book issued successfully!");
                } else {
                    System.out.println("Book is already issued.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void returnBook(int id) {

        for (Book book : books) {

            if (book.getId() == id) {

                if (!book.isAvailable()) {
                    book.returnBook();
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("Book was not issued.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void searchBook(String title) {

        boolean found = false;

        for (Book book : books) {

            if (book.getTitle()
                    .toLowerCase()
                    .contains(title.toLowerCase())) {

                System.out.println(book);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }
}
