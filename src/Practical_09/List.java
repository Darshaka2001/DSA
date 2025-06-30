package Practical_09;

public class List {
    private Product[] dataArray;
    private int nextIndex;
    private int maxSize;

    public List(int maxSize) {
        this.maxSize = maxSize;
        this.dataArray = new Product[maxSize];
        nextIndex = 0;
    }

    public void add(Product data){
        if (isFull()){
            System.out.println("List is Full");
        }
        dataArray[nextIndex++] = data;
    }

    public Product get(int index){
        if (isEmpty()){
            System.out.println("List is Empty");
        }
        return dataArray[index];
    }

    public boolean isFull(){
        return maxSize == nextIndex;
    }

    public boolean isEmpty(){
        return nextIndex == 0;
    }

    public int size(){
        return nextIndex;
    }

    public void display(){
        for (int i = 0; i < size(); i++) {
            System.out.println(dataArray[i]);
        }
    }
}
