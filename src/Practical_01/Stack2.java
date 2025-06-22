package Practical_01;

public class Stack2 {
    private int maxSize;
    private int[] arr;
    private int top;

    public Stack2(int size) {
        maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            arr[++top] = value;
        }
    }

    public int pop() {
        if (top >= 0) {
            return arr[top--];
        }
        return -1; // Indicate underflow
    }

    public int peek() {
        if (top >= 0) {
            return arr[top];
        }
        return -1; // Indicate empty stack
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}
