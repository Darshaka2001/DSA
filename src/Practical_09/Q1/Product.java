package Practical_09.Q1;

public class Product {
    String productId;
    String productName;
    String category;
    double unitPrice;
    int qty;

    public Product(String productId, String productName, String category, double unitPrice, int qty) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.unitPrice = unitPrice;
        this.qty = qty;

    }

    public double getSaleAmount(){
        return unitPrice * qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public String toString(){
        return String.format("ID: %-5s | Name: %-20s | Category: %-12s | Price: %-10.2f | Qty: %-4d | Sales: %-12.2f",
                productId, productName, category, unitPrice, qty, getSaleAmount());
    }
}
