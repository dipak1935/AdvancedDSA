package BinaryTree;

public class P6_PrintKLevelsDown {
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
            Node h = new Node(30);
            Node i = new Node(70);

            root = a;

            a.left = b;
            a.right = c;

            b.left = d;
            b.right = e;

            c.left = f;
            c.right = g;

            e.left = h;
            f.right = i;


            return root;
        }
        public void printKLevelsDown(Node root,int k){

            if(root==null) return;

            if(k==0) System.out.print(root.data+" ");

            printKLevelsDown(root.left,k-1);
            printKLevelsDown(root.right,k-1);

        }


    }
    public void printKLevels(Node root,int k){

        if(root==null||k<0) return;

        if(k==0) {
            System.out.println(root.data);
            return;
        }

        printKLevels(root.left,k-1);
        printKLevels(root.right,k-1);

    }

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        Node root=tree.createBinaryTree();

        tree.printKLevelsDown(root,2);


    }
}
