package abstraction;

public class Product {
    private String productID;
    private String productName;
    private String productCategory;
    private double unitPrice;
    private int qty;

    public Product(String productID, String productName, String productCategory, double unitPrice, int qty) {
        this.productID = productID;
        this.productName = productName;
        this.productCategory = productCategory;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getSalesAmount(){
        return unitPrice * qty;
    }

    public String toString(){
        return String.format("%-8s | %-20s | %-15s | %10.2f | %-5d | %10.2f",
                productID,productName,productCategory,unitPrice,qty,getSalesAmount());
    }

}
