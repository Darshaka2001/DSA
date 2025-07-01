package Practical_06;

public class Q1 {
    public static void printTree(BinaryTree tree){
        System.out.print("In-Order Traversal : ");
        tree.inorder();
        System.out.print("\nPre-order Traversal : ");
        tree.preOrder();
        System.out.print("\nPost-Order Traversal : ");
        tree.postOrder();
        System.out.println("\n\n");
    }

    public static void printTree(StringBinaryTree tree){
        System.out.print("In-Order Traversal : ");
        tree.inOrder();
        System.out.print("\nPre-order Traversal : ");
        tree.preOrder();
        System.out.print("\nPost-Order Traversal : ");
        tree.postOrder();
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] input1 = {69,25,62,88,10,37,99 };
        int[] input2 = {32,24,6,2,39,41,30,145};
        int[] input3 = {120,46,7,2,31,39,23,40};
        String[] input4 = {"S", "K", "R", "B", "C", "M", "W", "A", "Z", "X", "D"};
        String[] input5 = {"Mary", "Tom", "Bob", "Wily", "John", "Mike", "Harry", "Kate", "Sam", "Sue" };

        BinaryTree tree = new BinaryTree();

        for (int data : input1){
            tree.insert(data);
        }
        printTree(tree);

        BinaryTree tree1 = new BinaryTree();
        for (int data : input2){
            tree1.insert(data);
        }
        printTree(tree1);

        BinaryTree tree2 = new BinaryTree();
        for (int data : input3){
            tree2.insert(data);
        }
        printTree(tree2);

        StringBinaryTree tree3 = new StringBinaryTree();
        for (String data : input4){
            tree3.insert(data);
        }
        printTree(tree3);

        StringBinaryTree tree4 = new StringBinaryTree();
        for (String data : input5){
            tree4.insert(data);
        }
        printTree(tree4);


    }
}
