# Library Management System

A simple Library Management System developed using Java and Maven.

## Technologies Used

* Java 21
* Maven
* Git
* GitHub

## Features

* Add a new book
* Display all books
* Search books by title
* Issue a book
* Return a book
* Check book availability

## Project Structure

```text
library-management/
├── pom.xml
├── .gitignore
├── README.md
└── src/
    └── main/
        └── java/
            └── com/
                └── library/
                    ├── Book.java
                    ├── Library.java
                    └── Main.java
```

## How to Run

### Compile the project

```bash
mvn clean compile
```

### Run the application

```bash
java -cp target/classes com.library.Main
```

## Application Menu

```text
==============================
     LIBRARY MANAGEMENT
==============================
1. Add Book
2. Display Books
3. Search Book
4. Issue Book
5. Return Book
6. Exit
==============================
Enter your choice:
```

## Author

Elango
