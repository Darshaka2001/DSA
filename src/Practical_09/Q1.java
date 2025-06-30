package Practical_09;

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




    }
}
