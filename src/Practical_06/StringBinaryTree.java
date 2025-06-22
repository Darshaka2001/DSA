package Practical_06;

public class StringBinaryTree {
    
    private SNode root;

    public StringBinaryTree() {
        root = null;
    }

    public void insert(String data){
        root  = insertRec(root, data);
    }
    
    private SNode insertRec(SNode root, String data){
        if (root == null){
            root = new SNode(data);
        } else if (data.compareTo(root.data) <= 0 ) {
            root.left = insertRec(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void preOrder(){
        preOrderRec(root);
    }

    private void preOrderRec(SNode root) {
        if (root != null){
            System.out.print(root.data+" ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void postOrder(){
        postOrderRec(root);
    }

    private void postOrderRec(SNode root) {
        if (root != null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void inOrder(){
        inOrderRec(root);
    }

    private void inOrderRec(SNode root) {
        if (root != null){
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }
}
