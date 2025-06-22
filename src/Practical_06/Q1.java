package Practical_06;

public class Q1 {
    public static void main(String[] args) {
        BT tree = new BT();
        tree.insert(10);
        tree.insert(7);
        tree.insert(5);
        tree.insert(22);
        tree.insert(81);
        tree.insert(74);

        tree.inorder();
        System.out.println();
        tree.preOrder();
        System.out.println();
        tree.postOrder();
    }
}
