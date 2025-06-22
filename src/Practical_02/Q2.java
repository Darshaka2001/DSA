package Practical_02;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        Queue queue = new Queue(arr.length);
        Queue queue1 = new Queue(arr.length/2);
        Queue queue2 = new Queue(arr.length/2);

        for (int value : arr){
            queue.enqueue(value);
        }

        int size  = queue1.size();
        for (int i = 0; i < size; i++) {
            queue1.enqueue(queue.dequeue());
        }

        for (int i = 0; i < size; i++) {
            queue2.enqueue(queue.dequeue());
        }

        for (int i = 0; i < size; i++) {
            System.out.print(queue1.peek());
        }

        for (int i = 0; i < size; i++) {
            System.out.print(queue2.peek());
        }
    }
}
