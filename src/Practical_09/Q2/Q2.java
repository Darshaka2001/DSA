package Practical_09.Q2;

public class Q2 {
    public static void main(String[] args) {
        List list = new List();
        list.add(new Product("T101", "Smartphone", "Electronics", 75000, 15));
        list.add(new Product("T102", "Smartwatch", "Electronics", 25000, 40));
        list.add(new Product("T103", "Wireless Charger", "Accessories", 25000, 60));
        list.add(new Product("T104", "Laptop", "Electronics", 120000, 10));
        list.add(new Product("T105", "Laptop Bag", "Accessories", 3000, 25));
        list.add(new Product("T106", "USB Cable", "Accessories", 700, 100));
        list.add(new Product("T107", "Bluetooth Speaker", "Electronics", 10000, 18));
        list.add(new Product("T108", "Headphones", "Electronics", 5000, 30));
        list.add(new Product("T109", "Mouse Pad", "Accessories", 900, 50));
        list.add(new Product("T110", "Tablet", "Electronics", 45000, 12));

        // a
        list.display();
        System.out.println("=================================================");

        // b,c
        list.display();
        list.bubbleSort();
        System.out.println("=================================================");

        list.display();

        System.out.println("=================================================");

        // d
        list.insertionSort();
        list.display();
        System.out.println("=================================================");


        // e
        //list.selectionSort();
        list.display();
        System.out.println("=================================================");

        Product product = list.searchProduct("USB Cable");
        if (product != null){
            product.setQuantity(120);
        }

        list.display();
        System.out.println("=================================================");

        for (int i = 0; i < list.size(); i++) {
            Product p = list.get(i);
            if (p.getSalesAmount() > 50000){
                System.out.println(p);
            }
        }

        System.out.println("=================================================");


        double totalSalesAmount = 0;
        double accessoriesSalesAmount = 0;
        for (int i = 0; i < list.size(); i++) {
            Product p = list.get(i);
            if (p.getCategory().equalsIgnoreCase("Accessories")){
                accessoriesSalesAmount += p.getSalesAmount();
                System.out.println(p);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            Product p = list.get(i);
            totalSalesAmount += p.getSalesAmount();
        }

        double percentage = (accessoriesSalesAmount / totalSalesAmount) * 100;

        System.out.println(totalSalesAmount);
        System.out.println(percentage);

    }
}
