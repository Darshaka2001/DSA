package Model_Exam.Q2;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {45, 22, 77, 11, 30, 90, 15, 25, 88};

        BinaryTree tree = new BinaryTree();

        for (int a : arr){
            tree.insert(a);
        }

        tree.inorder();
        System.out.println();
        tree.postOrder();
        System.out.println();
        tree.preOrder();
    }
}
