package Practical_02;

public class Queue {
    private int[] dataArray;
    private int front;
    private int rear;
    private int maxSize;
    private int currentSize;

    public Queue(int size) {
        maxSize = size;
        dataArray = new int[size];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void enqueue(int data){
        if (currentSize < maxSize){
            rear = (rear + 1) % maxSize;
            dataArray[rear] = data;
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

    public int peek(){
        if (currentSize > 0){
            return dataArray[front];
        }
        return -1;
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }

    public boolean isFull(){
        return currentSize == maxSize;
    }

    public int size(){
        return currentSize;
    }

}

