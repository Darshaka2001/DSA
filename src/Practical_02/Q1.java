package Practical_02;

public class Q1 {
    public static class Queue {
        private String[] dataArray;
        private int front;
        private int rear;
        private int maxSize;
        private int currentSize;

        public Queue(int size) {
            maxSize = size;
            dataArray = new String[size];
            front = 0;
            rear = -1;
            currentSize = 0;
        }

        public void enqueue(String data){
            if (currentSize < maxSize){
                rear = (rear + 1) % maxSize;
                dataArray[rear] = data;
                currentSize++;
            }
        }

        public String dequeue(){
            if (currentSize > 0){
                String value = dataArray[front];
                front = (front + 1) % maxSize;
                currentSize--;
                return value;
            }
            return null;
        }

        public String peek(){
            if (currentSize > 0){
                return dataArray[front];
            }
            return null;
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

        public void printQueue(){

        }

    }
    public static void main(String[] args) {
        Queue queue = new Queue(2);

        queue.enqueue("Data");
        queue.enqueue("Structures");
        System.out.println(queue.dequeue()+" "+queue.dequeue());
    }
}
