package Practical_03;

public class Q3 {
    public static int[] insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] inputs = {10, 9, 52, 24, 35, 11, 9, 12, 3, 11, 25, 24, 8, 11, 42 };
        List l1 = new List(inputs.length);

        for (int element : inputs){
            l1.add(element);
        }

        // Mean
        int sum = 0;
        for (int i = 0; i < l1.size(); i++) {
            sum += l1.get(i);
        }

        double mean = (double) sum / l1.size();
        System.out.println("Mean : "+ mean);

        // Median
        int[] sortedArray =  insertionSort(l1.toArray());
        int arraySize = sortedArray.length;

        if (arraySize % 2 == 0){
            System.out.println("Middle : "+sortedArray[arraySize/2]);
        } else {
            int firstMiddle = (arraySize / 2) - 1;
            int secondMiddle = arraySize / 2;

            int result = (int) ((firstMiddle+secondMiddle) / 2.0);
            System.out.println("Middle : "+sortedArray[result]);
        }

        // Mode

        int mode = sortedArray[0];
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < arraySize; i++) {
            if (sortedArray[i] == sortedArray[i-1]){
                currentCount++;
            } else {
                currentCount = 1;
            }
            if (currentCount > maxCount){
                maxCount = currentCount;
                mode = sortedArray[i];
            }

        }

        System.out.println("Mode : "+mode);

        // Range

        int lowest = sortedArray[0];
        int highest = sortedArray[arraySize - 1];

        int range = highest - lowest;

        System.out.println("Range : "+range);



    }
}
