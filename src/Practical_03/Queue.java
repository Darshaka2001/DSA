package Practical_03;

class Queue{
    private int[] dataArray;
    private int front;
    private int rear;
    private int maxSize;
    private int currentSize;

    public Queue(int size) {
        this.maxSize = size;
        dataArray = new int[size];
        rear = -1;
        front = 0;
        currentSize = 0;
    }

    public void enqueue(int value){
        if (currentSize < maxSize){
            rear = (rear + 1) % maxSize;
            dataArray[rear] = value;
            currentSize++;
        }
    }

    public int dequeue(){
        if (currentSize > 0){
            int value = dataArray[front];
            front = (front + 1) % maxSize;
            currentSize--;
            return value;
        }
        return -1;
    }

    public int indexOf(int data){
        for (int i = 0; i < currentSize; i++) {
            int index = (front + i) % maxSize;
            if (data == dataArray[index]){
                return i;
            }
        }
        return -1;
    }

    public boolean contains(int data){
        return indexOf(data) != -1;
    }

    public void printQueue(){
        System.out.print("[");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(dataArray[i]+", ");
        }
        System.out.print(isEmpty() ? "empty]":"\b\b]");
    }

    public int size(){
        return currentSize;
    }

    public boolean isFull(){
        return maxSize == currentSize;
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }
}
