package Practical_09.Q1;

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

    public void sortData(){
        for (int i = 0; i < size() -1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size(); j++) {
                if (dataArray[j].getSaleAmount() < dataArray[minIndex].getSaleAmount()){
                    minIndex = j;
                }
            }

            Product temp = dataArray[minIndex];
            dataArray[minIndex] = dataArray[i];
            dataArray[i] = temp;
        }
    }

    public Product searchByName(String name){
        for (int i = 0; i < size(); i++) {
            if (dataArray[i].productName.equals(name)){
                return dataArray[i];
            }
        }
        return null;
    }

}
