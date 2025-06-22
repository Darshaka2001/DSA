package Practical_03;

public class List {
    private int[] dataArray;
    private int nextIndex;
    private int initSize;

    List(int initSize){
        this.initSize = initSize;
        dataArray = new int[initSize];
        nextIndex = 0;
    }

    public void add(int data){
        if (nextIndex >= initSize){
            System.out.println("List is full");
            return;
        }
        dataArray[nextIndex++] = data;
    }

    public void add(int data, int index){
        if (index < 0 || index > nextIndex){
            System.out.println("Invalid index.");
        }

        if (nextIndex >= initSize){
            System.out.println("List id full.");
        }

        for (int i = nextIndex; i >= index ; i--) {
            dataArray[i+1] = dataArray[i];
        }
        dataArray[index] = data;
        nextIndex++;
    }

    public void addFirst(int data){

    }

    public void addLast(int data){

    }

    public void remove(int index){
        if (index < 0 || index > nextIndex){
            System.out.println("Invalid index.");
        }
        if (isEmpty()){
            System.out.println("List is empty.");
        }

        for (int i = index; i < nextIndex ; i++) {
            dataArray[i] = dataArray[i+1];
        }
        nextIndex--;
    }

    public void removeFirst(){
        if (isEmpty()){
            System.out.println("List is Empty.");
        }

        for (int i = 0; i < nextIndex - 1; i++) {
            dataArray[i] = dataArray[i+1];
        }
        nextIndex--;
    }

    public void removeLast(){
        if (isEmpty()){
            System.out.println("List is Empty.");
        }

        nextIndex--;
    }

    public int size(){
        return nextIndex;
    }

    public int get(int index){
        if (index < 0 || index >= nextIndex){
            System.out.println("invalid index.");
            return -1;
        }
        return dataArray[index];
    }

    public void printList(){
        for (int i = 0; i < size(); i++) {
            System.out.print(dataArray[i]+", ");
        }
        System.out.print("\b\b");
    }

    public int[] toArray(){
        int[] result = new int[nextIndex];
        for (int i = 0; i < nextIndex; i++) {
            result[i] = dataArray[i];
        }
        return result;
    }

    public boolean isEmpty(){
        return nextIndex == 0;
    }

    public boolean isFull(){
        return nextIndex == initSize;
    }


}

