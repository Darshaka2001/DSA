package Practical_09.Q1;

public class Q1 {
    public static void main(String[] args) {
        List l1 = new List(10);
        l1.add(new Product("P108", "Wireless Mouse", "Electronics", 2160, 30));
        l1.add(new Product("P034", "Handbag", "Accessories", 3450, 5));
        l1.add(new Product("P078", "Phone cover", "Accessories", 1750, 26));
        l1.add(new Product("P105", "Bluetooth Speaker", "Electronics", 13780, 5));
        l1.add(new Product("P003", "Ladies blouse", "Clothing", 1650, 18));
        l1.add(new Product("P053", "Shampoo", "Groceries", 2370, 20));
        l1.add(new Product("P114", "Laptop", "Electronics", 250000, 3));
        l1.add(new Product("P004", "Frock", "Clothing", 4520, 10));
        l1.add(new Product("P117", "Earphone", "Electronics", 7860, 2));
        l1.add(new Product("P120", "Microwave oven", "Electronics", 56830, 15));

        l1.display();

        System.out.println("\n\n");

        l1.sortData();
        l1.display();
        System.out.println("\n\n");

        Product frock = l1.searchByName("Frock");
        if (frock != null){
            frock.setQty(49);
        }

        l1.display();
        System.out.println("\n\n");

        for (int i = 0; i < l1.size(); i++) {
            Product p = l1.get(i);
            if (p.getSaleAmount() > 40000){
                System.out.println(p);
            }
        }

        System.out.println("\n\n");

        double electronicsSalesAmount = 0;
        for (int i = 0; i < l1.size(); i++) {
            Product p = l1.get(i);
            if (p.category.equalsIgnoreCase("Electronics")){
                electronicsSalesAmount += p.getSaleAmount();
                System.out.println(p);
            }
        }
        System.out.printf("\nTotal Sales from Electronics Category: Rs. %.2f\n", electronicsSalesAmount);

        double totalSales = 0;

        for (int i = 0; i < l1.size(); i++) {
            Product p = l1.get(i);
            totalSales += p.getSaleAmount();
        }

        double parentage = (electronicsSalesAmount / totalSales) * 100;

        System.out.println("\n\n");
        System.out.println("Total sales Amount : "+totalSales);
        System.out.printf("the percentage of sale amount of electronic category : %.2f",parentage);


    }
}
