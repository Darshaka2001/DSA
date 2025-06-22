package Practical_04;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {15, 22, 7, 13, 8, 6, 19, 20, 4, 17};
        List l1 = new List(arr.length);

        for (int element : arr){
            l1.add(element);
        }

        int sum = 0;
        for (int i = 0; i < l1.size(); i++) {
            sum += l1.get(i);
        }
        System.out.println("Sum : "+sum);

        double avg = (double) sum / l1.size();

        System.out.println("Avarage : "+avg);

        int max = l1.get(0);
        int min = l1.get(0);
        int count = 0;

        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i) > max){
                max = l1.get(i);
            }
            if (l1.get(i) < min){
                min = l1.get(i);
            }
            if (l1.get(i) % 2 == 0){
                count++;
            }
        }

        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
        System.out.println("Even count : "+count);

    }
}
