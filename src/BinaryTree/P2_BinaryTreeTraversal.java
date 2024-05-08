package BinaryTree;

public class P2_BinaryTreeTraversal {
    public static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
        }
    }
    public static class BinaryTree {

        Node root = null;

        Node createBinaryTree() {

           Node a=new Node(50);
            Node b=new Node(25);
            Node c=new Node(75);
            Node d=new Node(12);
            Node e=new Node(37);
            Node f=new Node(62);
            Node g=new Node(87);

            root = a;

            a.left = b;
            a.right = c;

            b.left = d;
            b.right = e;

            c.left = f;
            c.right = g;

            return root;
        }
        void displayPreOrder(Node root){

            if(root==null) return;

            System.out.print(root.data+" ");

            displayPreOrder(root.left);
            displayPreOrder(root.right);

        }
        void displayInOrder(Node root){

            if(root==null) return;

            displayInOrder(root.left);
            System.out.print(root.data+" ");
            displayInOrder(root.right);

        }
        void displayPostOrder(Node root){

            if(root==null) return;

            displayPostOrder(root.left);
            displayPostOrder(root.right);

            System.out.print(root.data+" ");

        }
    }
    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();

        Node root=tree.createBinaryTree();

        tree.displayPreOrder(root);
        System.out.println();
        tree.displayInOrder(root);
        System.out.println();
        tree.displayPostOrder(root);
        System.out.println();

    }
}
