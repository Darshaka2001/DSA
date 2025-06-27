package Praticle_09.Q2;

public class ElectronicsStoreAnalysis {

    public static void main(String[] args) {

        // a. Input the sales details into a contiguous list data structure.
        ProductList productList = new ProductList();
        productList.add(new Product("T101", "Smartphone", "Electronics", 75000, 15));
        productList.add(new Product("T102", "Smartwatch", "Electronics", 25000, 40));
        productList.add(new Product("T103", "Wireless Charger", "Accessories", 2500, 60));
        productList.add(new Product("T104", "Laptop", "Electronics", 120000, 10));
        productList.add(new Product("T105", "Laptop Bag", "Accessories", 3000, 25));
        productList.add(new Product("T106", "USB Cable", "Accessories", 700, 100));
        productList.add(new Product("T107", "Bluetooth Speaker", "Electronics", 10000, 18));
        productList.add(new Product("T108", "Headphones", "Electronics", 5000, 30));
        productList.add(new Product("T109", "Mouse Pad", "Accessories", 900, 50));
        productList.add(new Product("T110", "Tablet", "Electronics", 45000, 12));

        // b. Calculate and display the total sales amount for each product.
        System.out.println("a & b. Initial Product List and Sales Amounts:");
        productList.display();
        System.out.println("\n--------------------------------------------------------------------------------------------------\n");

        // c. Sort the list by total sales amount in descending order using Bubble Sort.
        System.out.println("c. List Sorted by Sales Amount (Descending) using Bubble Sort:");
        productList.bubbleSortBySalesAmountDesc();
        productList.display();
        System.out.println("\n--------------------------------------------------------------------------------------------------\n");

        // d. Sort the list by product name in ascending alphabetical order using Insertion Sort.
        System.out.println("d. List Sorted by Product Name (Ascending) using Insertion Sort:");
        productList.insertionSortByNameAsc();
        productList.display();
        System.out.println("\n--------------------------------------------------------------------------------------------------\n");

        // e. Sort the list by quantity sold in ascending order using Selection Sort.
        System.out.println("e. List Sorted by Quantity Sold (Ascending) using Selection Sort:");
        productList.selectionSortByQuantityAsc();
        productList.display();
        System.out.println("\n--------------------------------------------------------------------------------------------------\n");

        // f. Using Sequential Search, find "USB Cable" and update its quantity to 120.
        System.out.println("f. Find and Update 'USB Cable':");
        Product usbCable = productList.sequentialSearchByName("USB Cable");
        if (usbCable != null) {
            usbCable.setQuantitySold(120);
            System.out.println("Updated Product Details:");
            System.out.println(usbCable);
        } else {
            System.out.println("Product 'USB Cable' not found.");
        }
        System.out.println("\n--------------------------------------------------------------------------------------------------\n");

        // g. Find and display all products with a total sales amount greater than Rs. 50,000.
        System.out.println("g. Products with Sales Amount > Rs. 50,000:");
        for (int i = 0; i < productList.size(); i++) {
            Product p = productList.get(i);
            if (p.getSalesAmount() > 50000) {
                System.out.println(p);
            }
        }
        System.out.println("\n--------------------------------------------------------------------------------------------------\n");

        // h. Identify all products in the Accessories category and compute the percentage of this amount.
        System.out.println("h. Accessories Category Sales Analysis:");
        double accessoriesSales = 0;
        double totalSales = 0;
        for (int i = 0; i < productList.size(); i++) {
            Product p = productList.get(i);
            if (p.getCategory().equalsIgnoreCase("Accessories")) {
                accessoriesSales += p.getSalesAmount();
            }
            totalSales += p.getSalesAmount();
        }

        if (totalSales > 0) {
            double percentage = (accessoriesSales / totalSales) * 100;
            System.out.printf("Total Sales from Accessories Category: Rs. %.2f\n", accessoriesSales);
            System.out.printf("Total Sales of All Products: Rs. %.2f\n", totalSales);
            System.out.printf("Percentage of Accessories Sales: %.2f%%\n", percentage);
        } else {
            System.out.println("No sales data to analyze.");
        }
    }
}
