package Practical_07;

import java.util.Scanner;

class Product {
    String productId;
    String name;
    String category;
    double price;

    Product(String productId, String name, String category, double price) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.price = price;
    }
}

public class Q1 {

    static Product[] products = new Product[10];

    static void inputAndDisplayProducts() {
        products[0] = new Product("P1001", "Toothpaste", "Grocery", 220.00);
        products[1] = new Product("P1002", "Notebook", "Stationery", 120.00);
        products[2] = new Product("P1003", "Shampoo", "Grocery", 450.00);
        products[3] = new Product("P1004", "Pen", "Stationery", 50.00);
        products[4] = new Product("P1005", "Soap", "Grocery", 110.00);
        products[5] = new Product("P1006", "Marker", "Stationery", 180.00);
        products[6] = new Product("P1007", "Chips", "Snacks", 250.00);
        products[7] = new Product("P1008", "Chocolate", "Snacks", 300.00);
        products[8] = new Product("P1009", "Rice", "Grocery", 1000.00);
        products[9] = new Product("P1010", "Biscuit", "Snacks", 200.00);

        System.out.println("Product Details:");
        for (Product p : products) {
            System.out.printf("ID: %s, Name: %s, Category: %s, Price: %.2f%n", p.productId, p.name, p.category, p.price);
        }
    }

    static void selectionSortProductsByPrice() {
        int n = products.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (products[j].price < products[minIdx].price) {
                    minIdx = j;
                }
            }
            Product temp = products[minIdx];
            products[minIdx] = products[i];
            products[i] = temp;
        }

        System.out.println("\nProducts Sorted by Price (Ascending):");
        for (Product p : products) {
            System.out.printf("ID: %s, Name: %s, Category: %s, Price: %.2f%n", p.productId, p.name, p.category, p.price);
        }
    }

    static void sequentialSearchProductsByPrice(double priceToSearch) {
        System.out.println("\nSequential Search for Products with Price " + priceToSearch + ":");
        boolean found = false;
        for (Product p : products) {
            if (p.price == priceToSearch) {
                System.out.printf("Found: ID: %s, Name: %s, Category: %s, Price: %.2f%n", p.productId, p.name, p.category, p.price);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products found with price " + priceToSearch);
        }
    }

    static void binarySearchProductsByPrice(double priceToSearch) {
        System.out.println("\nBinary Search for Products with Price " + priceToSearch + ":");
        int low = 0;
        int high = products.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (products[mid].price == priceToSearch) {
                System.out.printf("Found: ID: %s, Name: %s, Category: %s, Price: %.2f%n", products[mid].productId, products[mid].name, products[mid].category, products[mid].price);
                found = true;
                // Check for other occurrences if any
                int left = mid - 1;
                while (left >= 0 && products[left].price == priceToSearch) {
                    System.out.printf("Found: ID: %s, Name: %s, Category: %s, Price: %.2f%n", products[left].productId, products[left].name, products[left].category, products[left].price);
                    left--;
                }
                int right = mid + 1;
                while (right < products.length && products[right].price == priceToSearch) {
                    System.out.printf("Found: ID: %s, Name: %s, Category: %s, Price: %.2f%n", products[right].productId, products[right].name, products[right].category, products[right].price);
                    right++;
                }
                break;
            } else if (products[mid].price < priceToSearch) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (!found) {
            System.out.println("No products found with price " + priceToSearch);
        }
    }

    public static void main(String[] args) {
        inputAndDisplayProducts();

        selectionSortProductsByPrice();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter price to search (Sequential Search): ");
        double searchPriceSeq = scanner.nextDouble();
        sequentialSearchProductsByPrice(searchPriceSeq);

        System.out.print("\nEnter price to search (Binary Search): ");
        double searchPriceBin = scanner.nextDouble();
        binarySearchProductsByPrice(searchPriceBin);

        scanner.close();
    }
}
