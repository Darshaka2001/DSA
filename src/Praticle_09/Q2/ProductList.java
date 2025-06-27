package Praticle_09.Q2;

public class ProductList {
    private Product[] products;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public ProductList() {
        this.products = new Product[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(Product product) {
        if (size < products.length) {
            products[size++] = product;
        }
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

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }

    public Product sequentialSearchByName(String name) {
        for (int i = 0; i < size; i++) {
            if (products[i].getProductName().equalsIgnoreCase(name)) {
                return products[i];
            }
        }
        return null;
    }

    public void bubbleSortBySalesAmountDesc() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (products[j].getSalesAmount() < products[j + 1].getSalesAmount()) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
    }

    public void insertionSortByNameAsc() {
        for (int i = 1; i < size; ++i) {
            Product key = products[i];
            int j = i - 1;
            while (j >= 0 && products[j].getProductName().compareTo(key.getProductName()) > 0) {
                products[j + 1] = products[j];
                j = j - 1;
            }
            products[j + 1] = key;
        }
    }

    public void selectionSortByQuantityAsc() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (products[j].getQuantitySold() < products[minIndex].getQuantitySold()) {
                    minIndex = j;
                }
            }
            Product temp = products[minIndex];
            products[minIndex] = products[i];
            products[i] = temp;
        }
    }
}
