package Practical_03;

public class Q1 {
    public static void main(String[] args) {

        int[] inputs = {10, 20, 10, 10, 30, 40, 50, 40, 50, 50, 10, 20, 20};

        Queue q1 = new Queue(inputs.length);

        for (int i = 0; i < inputs.length; i++) {
            if (!q1.contains(inputs[i])){
                q1.enqueue(inputs[i]);
            }
        }

        q1.printQueue();



    }
}
