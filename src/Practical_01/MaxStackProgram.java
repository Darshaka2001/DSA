package Practical_01;

public class MaxStackProgram {
    private Stack2 mainStack;
    private Stack2 maxStack;

    public MaxStackProgram(int size) {
        mainStack = new Stack2(size);
        maxStack = new Stack2(size);
    }

    public void push(int value) {
        mainStack.push(value);
        if (maxStack.isEmpty() || value >= maxStack.peek()) {
            maxStack.push(value);
        }
    }

    public void printDescending() {
        int[] temp = new int[mainStack.size()];
        int index = 0;

        // Pop all elements to temp array
        while (!mainStack.isEmpty()) {
            temp[index++] = mainStack.pop();
        }

        // Sort in descending order
        for (int i = 0; i < index - 1; i++) {
            for (int j = 0; j < index - i - 1; j++) {
                if (temp[j] < temp[j + 1]) {
                    int swap = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = swap;
                }
            }
        }

        // Print sorted array
        for (int i = 0; i < index; i++) {
            System.out.print(temp[i] + (i < index - 1 ? ", " : ""));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MaxStackProgram program = new MaxStackProgram(5);
        int[] input = {3, 12, 9, 27, 15};

        for (int value : input) {
            program.push(value);
        }

        System.out.print("Output: ");
        program.printDescending();

    }
}
