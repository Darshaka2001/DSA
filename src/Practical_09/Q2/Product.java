package Practical_09.Q2;

public class Product {
    private String productID;
    private String productName;
    private  String category;
    private double unitPrice;
    private int quantity;

    public Product(String productID, String productName, String category, double unitPrice, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.category = category;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSalesAmount(){
        return unitPrice * quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString(){
        return String.format("%-5s | %-20s | %-15s | %-10.2f | %-4d | %-10.2f",
                productID, productName, category, unitPrice, quantity, getSalesAmount());
    }

}
