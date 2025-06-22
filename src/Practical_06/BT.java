package Practical_06;


public class BT {

    Node root;

    public void insert(int data) {
        root = insertRec(root,data);
    }

    public Node insertRec(Node root, int data){
        if (root == null)
            root = new Node(data);
        else if (data < root.data) {
            root.left = insertRec(root.left,data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void inorder(){
        inorderRec(root);
    }

    public void inorderRec(Node root){
        if (root != null){
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }

    }

    public void preOrder(){
        preOrderRec(root);
    }

    private void preOrderRec(Node root) {
        if (root != null){
            System.out.print(root.data + " ");
            inorderRec(root.left);
            inorderRec(root.right);
        }
    }

    public void postOrder(){
        postOrderRec(root);
    }

    private void postOrderRec(Node root) {
        if (root != null){
            inorderRec(root.left);
            inorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
}
