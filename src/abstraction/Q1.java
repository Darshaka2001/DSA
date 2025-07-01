package abstraction;

public class Q1 {
    public static void main(String[] args) {
        List productList = new List(10);

        productList.add(new Product("P108","Wireless Mouse","Electronics",2160,30));
        productList.add(new Product("P034","Handbag","Accessories",3450,5));
        productList.add(new Product("P078","Phone cover","Accessories",1750,26));
        productList.add(new Product("P105","Bluetooth Speaker","Electronics",13780,5));
        productList.add(new Product("P003","Ladies blouse ","Clothing",1650,18));
        productList.add(new Product("P053","Shampoo","Groceries",2370,20));
        productList.add(new Product("P114","Laptop","Electronics",250000,3));
        productList.add(new Product("P004","Frock","Clothing",4520,10));
        productList.add(new Product("P117","Earphone","Electronics",7860,2));
        productList.add(new Product("P120","Microwave oven","Electronics",56830,15));

        productList.display();

        System.out.println("\n\n\n");

        productList.selectionSort();
        productList.display();

        for (int i = 0; i < productList.size(); i++) {
            Product p = productList.get(i);
            if (p.getProductName().equalsIgnoreCase("Frock")){
                p.setQty(49);
            }
        }

        System.out.println("\n\n\n");
        productList.display();
        System.out.println("\n\n\n");

        for (int i = 0; i < productList.size(); i++) {
            Product p = productList.get(i);
            if (p.getSalesAmount() > 40000){
                System.out.println(p);
            }
        }
        System.out.println("\n\n\n");

        double electronicsSalesTotal = 0;

        for (int i = 0; i < productList.size(); i++) {
            Product p = productList.get(i);
            if (p.getProductCategory().equalsIgnoreCase("Electronics")){
                electronicsSalesTotal += p.getSalesAmount();
//                System.out.println(p);
            }
        }
        System.out.println("\n\n\n");

        System.out.println("elec total : "+electronicsSalesTotal);

        double totalSaleAmuont = 0;
        for (int i = 0; i < productList.size(); i++) {
            Product p = productList.get(i);
            totalSaleAmuont += p.getSalesAmount();
        }

        System.out.println("total Amount :"+totalSaleAmuont);

        double persantage = (electronicsSalesTotal / totalSaleAmuont) * 100;

        System.out.println("persantage : "+persantage+"%");
        System.out.println();

        productList.search("P004");

    }
}
