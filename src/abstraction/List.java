package abstraction;

public class List {
    private Product[] products;
    private int maxSize;
    private int nextIndex;

    public List(int size) {
        this.maxSize = size;
        products = new Product[size];
        nextIndex = 0;
    }

    public void add(Product product){
        if (isFull()){
            System.out.println("List is Full.");
            return;
        }
        products[nextIndex++] = product;
    }

    public boolean isFull(){
        return nextIndex == maxSize;
    }

    public int size(){
        return nextIndex;
    }

    public void display(){
        for (int i = 0; i < size(); i++) {
            System.out.println(products[i]);
        }
    }

    public Product get(int index){
        return products[index];
    }

    public void selectionSort(){
        for (int i = 0; i < size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size(); j++) {
                if (products[j].getSalesAmount() < products[minIndex].getSalesAmount()){
                    minIndex = j;
                }
            }
            Product temp = products[minIndex];
            products[minIndex] = products[i];
            products[i] = temp;
        }
    }

    public void search(String id){
        for (int i = 0; i < size(); i++) {
            Product p = get(i);
            if (id.equalsIgnoreCase(p.getProductID())){
                System.out.println(p);
            }
        }
    }


}
