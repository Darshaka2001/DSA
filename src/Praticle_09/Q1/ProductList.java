package Praticle_09.Q1;

public class ProductList {
    private Product[] products;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public ProductList() {
        this.products = new Product[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(Product product) {
        if (size == products.length) {

            System.out.println("List is full. Cannot add more products.");
            return;
        }
        products[size++] = product;
    }

    public int size() {
        return size;
    }

    public Product get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }
        return products[index];
    }

    public Product findProductByName(String name) {
        for (int i = 0; i < size; i++) {
            if (products[i].productName.equalsIgnoreCase(name)) {
                return products[i];
            }
        }
        return null;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }

    public void selectionSortBySalesAmount() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (products[j].getSalesAmount() < products[minIndex].getSalesAmount()) {
                    minIndex = j;
                }
            }
            Product temp = products[minIndex];
            products[minIndex] = products[i];
            products[i] = temp;
        }
    }
}
