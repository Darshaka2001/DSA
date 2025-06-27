package Praticle_09.Q1;

public class UBuyStoreAnalysis {

    public static void main(String[] args) {

        // a. Using contiguous list data structure input above sales details.
        ProductList productList = new ProductList();
        productList.add(new Product("P108", "Wireless Mouse", "Electronics", 2160, 30));
        productList.add(new Product("P034", "Handbag", "Accessories", 3450, 5));
        productList.add(new Product("P078", "Phone cover", "Accessories", 1750, 26));
        productList.add(new Product("P105", "Bluetooth Speaker", "Electronics", 13780, 5));
        productList.add(new Product("P003", "Ladies blouse", "Clothing", 1650, 18));
        productList.add(new Product("P053", "Shampoo", "Groceries", 2370, 20));
        productList.add(new Product("P114", "Laptop", "Electronics", 250000, 3));
        productList.add(new Product("P004", "Frock", "Clothing", 4520, 10));
        productList.add(new Product("P117", "Earphone", "Electronics", 7860, 2));
        productList.add(new Product("P120", "Microwave oven", "Electronics", 56830, 15));

        // b. Calculate the sales amount of each product and display them.
        System.out.println("a & b. Initial Product List with Sales Amount:");
        productList.display();
        System.out.println("\n--------------------------------------------------------------------------------------------------\n");

        // c. Sort the sales details according to the sales amount using selection sort.
        productList.selectionSortBySalesAmount();
        System.out.println("c. Sorted Product List (by Sales Amount):");
        productList.display();
        System.out.println("\n--------------------------------------------------------------------------------------------------\n");

        // d. Correct the quantity for "Frock" and display the updated list.
        Product frock = productList.findProductByName("Frock");
        if (frock != null) {
            frock.setQuantitySold(49);
        }
        System.out.println("d. Updated Product List (Frock quantity corrected to 49):");
        productList.display();
        System.out.println("\n--------------------------------------------------------------------------------------------------\n");

        // e. Find and display products with total sale amount > Rs. 40,000.
        System.out.println("e. Products with Sales Amount > Rs. 40,000:");
        for (int i = 0; i < productList.size(); i++) {
            Product p = productList.get(i);
            if (p.getSalesAmount() > 40000) {
                System.out.println(p);
            }
        }
        System.out.println("\n--------------------------------------------------------------------------------------------------\n");

        // f. Identify Electronics products and calculate total sales from the category.
        System.out.println("f. Electronics Category Products and Total Sales:");
        double electronicsTotalSales = 0;
        for (int i = 0; i < productList.size(); i++) {
            Product p = productList.get(i);
            if (p.category.equalsIgnoreCase("Electronics")) {
                System.out.println(p);
                electronicsTotalSales += p.getSalesAmount();
            }
        }
        System.out.printf("\nTotal Sales from Electronics Category: Rs. %.2f\n", electronicsTotalSales);
        System.out.println("\n--------------------------------------------------------------------------------------------------\n");

        // g. Calculate the percentage of electronics sales relative to total sales.
        System.out.println("g. Percentage of Electronics Sales relative to Total Sales:");
        double totalSales = 0;
        for (int i = 0; i < productList.size(); i++) {
            totalSales += productList.get(i).getSalesAmount();
        }

        if (totalSales > 0) {
            double percentage = (electronicsTotalSales / totalSales) * 100;
            System.out.printf("Total Sales of All Categories: Rs. %.2f\n", totalSales);
            System.out.printf("Percentage of Electronics Sales: %.2f%%\n", percentage);
        } else {
            System.out.println("Total sales are zero, cannot calculate percentage.");
        }
    }
}
