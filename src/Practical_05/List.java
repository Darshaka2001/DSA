package Practical_05;

public class List {
    private int[] dataArray;
    private int nextIndex;
    private int size;

    List(int size){
        this.size = size;
        dataArray = new int[size];
        nextIndex = 0;
    }

    public void add(int data){
        if (isFull()){
            System.out.println("List is full");
            return;
        }
        dataArray[nextIndex++] = data;
    }

    public int get(int index){
        if (index > nextIndex)
            return -1;

        return dataArray[index];
    }

    public void set(int index, int value) {
        if (index >= nextIndex || index < 0) {
            System.out.println("Index out of bounds");
            return;
        }
        dataArray[index] = value;
    }

    public int indexOf(int data) {
        for (int i = 0; i < size(); i++) {
            if (dataArray[i] == data)
                return i;
        }
        return -1;
    }

    public int size(){
        return nextIndex;
    }

    public boolean isEmpty(){
        return nextIndex == 0;
    }
    public boolean isFull(){
        return nextIndex == size;
    }
}
