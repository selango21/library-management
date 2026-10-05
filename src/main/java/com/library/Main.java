package com.library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Sample books
        library.addBook(
                new Book(1, "Java Programming", "James Gosling")
        );

        library.addBook(
                new Book(2, "Clean Code", "Robert C. Martin")
        );

        library.addBook(
                new Book(3, "Effective Java", "Joshua Bloch")
        );

        while (true) {

            System.out.println("\n==============================");
            System.out.println("     LIBRARY MANAGEMENT");
            System.out.println("==============================");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");

            // Prevent InputMismatchException
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number from 1 to 6.");
                scanner.nextLine();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter book ID: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid ID! Please enter a number.");
                        scanner.nextLine();
                        break;
                    }

                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();

                    library.addBook(
                            new Book(id, title, author)
                    );

                    break;

                case 2:

                    library.displayBooks();
                    break;

                case 3:

                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();

                    library.searchBook(searchTitle);
                    break;

                case 4:

                    System.out.print("Enter book ID to issue: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid ID! Please enter a number.");
                        scanner.nextLine();
                        break;
                    }

                    int issueId = scanner.nextInt();
                    scanner.nextLine();

                    library.issueBook(issueId);
                    break;

                case 5:

                    System.out.print("Enter book ID to return: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid ID! Please enter a number.");
                        scanner.nextLine();
                        break;
                    }

                    int returnId = scanner.nextInt();
                    scanner.nextLine();

                    library.returnBook(returnId);
                    break;

                case 6:

                    System.out.println("Thank you for using Library Management System!");
                    scanner.close();
                    return;

                default:

                    System.out.println("Invalid choice! Please enter 1 to 6.");
            }
        }
    }
}
