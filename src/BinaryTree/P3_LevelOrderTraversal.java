package BinaryTree;

public class P3_LevelOrderTraversal {
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

            Node a = new Node(50);
            Node b = new Node(25);
            Node c = new Node(75);
            Node d = new Node(12);
            Node e = new Node(37);
            Node f = new Node(62);
            Node g = new Node(87);

            root = a;

            a.left = b;
            a.right = c;

            b.left = d;
            b.right = e;

            c.left = f;
            c.right = g;

            return root;
        }
        public void displayLevelOrder(Node root){

            if(root.left==null) return;


            System.out.print(root.data+" ");
            System.out.println();
            System.out.print(root.left.data+" ");
            System.out.print(root.right.data+" ");

            System.out.println();

            displayLevelOrder(root.left);
            displayLevelOrder(root.right);



        }

    }

    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();
        Node root=tree.createBinaryTree();

        tree.displayLevelOrder(root);
    }
}
