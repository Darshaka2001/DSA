package Practical_07;

import java.util.Scanner;

class Book {
    String bookId;
    String title;
    String author;
    int year;

    Book(String bookId, String title, String author, int year) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.year = year;
    }
}

public class Q2 {

    static Book[] books = new Book[10];

    static void inputAndDisplayBooks() {
        books[0] = new Book("B001", "Data Structures", "S. Tanenbaum", 2018);
        books[1] = new Book("B002", "Operating Systems", "A. Silberschatz", 2020);
        books[2] = new Book("B003", "Computer Networks", "A. S. Tanenbaum", 2017);
        books[3] = new Book("B004", "Java Programming", "H. Schildt", 2021);
        books[4] = new Book("B005", "Python Crash Course", "E. Matthes", 2019);
        books[5] = new Book("B006", "Database Management", "R. Elmasri", 2016);
        books[6] = new Book("B007", "Discrete Mathematics", "K. Rosen", 2015);
        books[7] = new Book("B008", "Artificial Intelligence", "S. Russell", 2022);
        books[8] = new Book("B009", "Software Engineering", "I. Sommerville", 2018);
        books[9] = new Book("B010", "Machine Learning", "T. Mitchell", 2021);

        System.out.println("Book Details:");
        for (Book b : books) {
            System.out.printf("ID: %s, Title: %s, Author: %s, Year: %d%n", b.bookId, b.title, b.author, b.year);
        }
    }

    static void selectionSortBooksByYearDescending() {
        int n = books.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (books[j].year > books[maxIdx].year) {
                    maxIdx = j;
                }
            }
            Book temp = books[maxIdx];
            books[maxIdx] = books[i];
            books[i] = temp;
        }

        System.out.println("\nBooks Sorted by Year (Descending):");
        for (Book b : books) {
            System.out.printf("ID: %s, Title: %s, Author: %s, Year: %d%n", b.bookId, b.title, b.author, b.year);
        }
    }

    static void sequentialSearchBooksByAuthor(String authorToSearch) {
        System.out.println("\nSequential Search for Books by Author \"" + authorToSearch + "\":");
        boolean found = false;
        for (Book b : books) {
            if (b.author.equalsIgnoreCase(authorToSearch)) {
                System.out.printf("Found: ID: %s, Title: %s, Author: %s, Year: %d%n", b.bookId, b.title, b.author, b.year);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by author \"" + authorToSearch + "\"");
        }
    }

    static void selectionSortBooksByAuthor() {
        int n = books.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (books[j].author.compareToIgnoreCase(books[minIdx].author) < 0) {
                    minIdx = j;
                }
            }
            Book temp = books[minIdx];
            books[minIdx] = books[i];
            books[i] = temp;
        }
    }

    static void binarySearchBooksByAuthor(String authorToSearch) {
        System.out.println("\nBinary Search for Books by Author \"" + authorToSearch + "\":");

        // Ensure the array is sorted by author for binary search
        selectionSortBooksByAuthor(); // Sort before binary search

        int low = 0;
        int high = books.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = books[mid].author.compareToIgnoreCase(authorToSearch);

            if (cmp == 0) {
                System.out.printf("Found: ID: %s, Title: %s, Author: %s, Year: %d%n", books[mid].bookId, books[mid].title, books[mid].author, books[mid].year);
                found = true;
                // Check for other occurrences if any
                int left = mid - 1;
                while (left >= 0 && books[left].author.equalsIgnoreCase(authorToSearch)) {
                    System.out.printf("Found: ID: %s, Title: %s, Author: %s, Year: %d%n", books[left].bookId, books[left].title, books[left].author, books[left].year);
                    left--;
                }
                int right = mid + 1;
                while (right < books.length && books[right].author.equalsIgnoreCase(authorToSearch)) {
                    System.out.printf("Found: ID: %s, Title: %s, Author: %s, Year: %d%n", books[right].bookId, books[right].title, books[right].author, books[right].year);
                    right++;
                }
                break;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (!found) {
            System.out.println("No books found by author \"" + authorToSearch + "\"");
        }
    }

    public static void main(String[] args) {
        inputAndDisplayBooks();

        selectionSortBooksByYearDescending();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter author to search (Sequential Search): ");
        String searchAuthorSeq = scanner.nextLine();
        sequentialSearchBooksByAuthor(searchAuthorSeq);

        System.out.print("\nEnter author to search (Binary Search): ");
        String searchAuthorBin = scanner.nextLine();
        binarySearchBooksByAuthor(searchAuthorBin);

        scanner.close();
    }
}

