package Praticle_09.Q2;

public class Product {
    String productID;
    String productName;
    String category;
    double unitPrice;
    int quantitySold;

    public Product(String productID, String productName, String category, double unitPrice, int quantitySold) {
        this.productID = productID;
        this.productName = productName;
        this.category = category;
        this.unitPrice = unitPrice;
        this.quantitySold = quantitySold;
    }

    public double getSalesAmount() {
        return unitPrice * quantitySold;
    }

    public String getProductName() {
        return this.productName;
    }

    public int getQuantitySold() {
        return this.quantitySold;
    }

    public String getCategory() {
        return this.category;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    @Override
    public String toString() {
        return String.format("ID: %-5s | Name: %-20s | Category: %-12s | Price: %-10.2f | Qty: %-4d | Sales: %-12.2f",
                productID, productName, category, unitPrice, quantitySold, getSalesAmount());
    }
}
