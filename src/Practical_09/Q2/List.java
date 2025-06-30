package Practical_09.Q2;

public class List {
    private Product[] products;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public List() {
        this.size = 0;
        products = new Product[DEFAULT_CAPACITY];
    }

    public void add(Product product){
        if (size == products.length){
            System.out.println("List is Full");
            return;
        }
        products[size++] = product;
    }

    public Product get(int index){
        return products[index];
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }

    public int size(){
        return size;
    }

    public void bubbleSort(){
        for (int i = 0; i < size - 1 ; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (products[j].getSalesAmount() > products[j+1].getSalesAmount()){
                    Product temp = products[j];
                    products[j] = products[j+1];
                    products[j+1] = temp;
                }
            }
        }
    }

    public void insertionSort(){
        for (int i = 0; i < size; i++) {
            Product key = products[i];
            int j = i - 1;
            while (j >= 0 && products[j].getProductName().compareTo(key.getProductName()) > 0){
                products[j + 1] = products[j];
                j = j - 1;
            }
            products[j + 1] = key;
        }
    }

    public void selectionSort(){
        for (int i = 0; i < size()-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (products[j].getQuantity() < products[minIndex].getQuantity()){
                    minIndex = j;
                }
            }

            Product temp = products[minIndex];
            products[minIndex] = products[i];
            products[i] = temp;
        }
    }

    public Product searchProduct(String input){
        for (int i = 0; i < size(); i++) {
            if (products[i].getProductName().equalsIgnoreCase(input)){
                return products[i];
            }
        }
        return null;
    }


}
