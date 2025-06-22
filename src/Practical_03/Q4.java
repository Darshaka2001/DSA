package Practical_03;

public class Q4 {
    public static int[] sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 8, 7, 20, 15, 4};
        List l1 = new List(arr.length);

        for (int element : arr){
            l1.add(element);
        }

        int[] sortedArray = sort(l1.toArray());

        System.out.print("[");
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(sortedArray[i]+",");
        }
        System.out.print("\b]");

        System.out.println();
        System.out.println(sortedArray[sortedArray.length - 2]);


    }
}
