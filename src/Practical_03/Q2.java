package Practical_03;

public class Q2 {
    public static void main(String[] args) {
        int[] input = {10,20,30,40,50,60,70,80,90,100};

        Queue queue = new Queue(input.length);

        Queue q1 = new Queue(input.length / 2);
        Queue q2 = new Queue(input.length / 2);

        for (int i = 0; i < input.length; i++) {
            if (i < input.length / 2){
                q1.enqueue(input[i]);
            }
            if (i >= input.length / 2) {
                q2.enqueue(input[i]);
            }
        }

        for (int i = 0; i < input.length / 2; i++) {
            System.out.print(q1.dequeue()+", "+ q2.dequeue()+", ");
        }
        System.out.println("\b\b");

    }
}
