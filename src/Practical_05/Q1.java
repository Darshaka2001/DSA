package Practical_05;

public class Q1 {

    public static int[] selectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;

    }

    public static void main(String[] args) {

        int[] input = {12, 78, 12, 14, 86, 25, 65, 10, 2, 71};

        int maxUniqueStems = 10;

        int[] uniqueStems = new int[maxUniqueStems];
        List[] leavesForStems = new List[maxUniqueStems];
        int stemsCount = 0;

        for (int number : input) {
            int stem = number / 10;
            int leaf = number % 10;

            boolean stemFound = false;
            int stemIndex = -1;

            for (int i = 0; i < stemsCount; i++) {
                if (uniqueStems[i] == stem) {
                    stemFound = true;
                    stemIndex = i;
                    break;
                }
            }

            if (stemFound) {
                leavesForStems[stemIndex].add(leaf);
            } else {
                uniqueStems[stemsCount] = stem;

                List newLeavesList = new List(10);
                newLeavesList.add(leaf);

                leavesForStems[stemsCount] = newLeavesList;

                stemsCount++;
            }


        }

        for (int i = 0; i < stemsCount; i++) {
            sortLeavesList(leavesForStems[i]);
        }

        System.out.println("Sorting the stems...");
        sortStemsAndParallelLeaves(uniqueStems, leavesForStems, stemsCount);
        System.out.println("Sorting complete.\n");

        System.out.println("Stem-and-Leaf Diagram:");
        System.out.println("Stem | Leaf");
        System.out.println("-----|-----------");

        for (int i = 0; i < stemsCount; i++) {
            // Print the stem with some basic formatting.
            System.out.print("  " + uniqueStems[i] + "  | ");

            // Get the corresponding list of leaves.
            List currentLeaves = leavesForStems[i];

            // Print all leaves in the list, separated by commas.
            for (int j = 0; j < currentLeaves.size(); j++) {
                System.out.print(currentLeaves.get(j));
                if (j < currentLeaves.size() - 1) {
                    System.out.print(",");
                }
            }
            // Move to the next line for the next stem.
            System.out.println();


        }
    }

    public static void sortLeavesList(List list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // If the element found is greater than the next element, swap them
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void sortStemsAndParallelLeaves(int[] stems, List[] leaves, int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (stems[j] > stems[j + 1]) {
                    // Swap the stems
                    int tempStem = stems[j];
                    stems[j] = stems[j + 1];
                    stems[j + 1] = tempStem;

                    // CRITICAL: Swap the corresponding leaves lists as well
                    List tempLeavesList = leaves[j];
                    leaves[j] = leaves[j + 1];
                    leaves[j + 1] = tempLeavesList;
                }
            }
        }
    }

}
