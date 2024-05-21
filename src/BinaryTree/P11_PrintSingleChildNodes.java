package BinaryTree;

public class P11_PrintSingleChildNodes {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
        }
    }

    public static class BinaryTree {

        private final Node root = null;

        public Node createBinaryTree() {

            Node a = new Node(50);
            Node b = new Node(25);
            Node c = new Node(75);
            Node d = new Node(12);
            Node e = new Node(37);
            Node f = new Node(62);
            Node g = new Node(87);
            Node h = new Node(30);

            Node k = new Node(70);

            a.left = b;
            a.right = c;

            b.left = d;
            b.right = e;

            c.left = f;
            c.right = g;

            e.left = h;


            f.right = k;

            return a;

        }
        public void printChildNode(Node node){

            if(node==null) return;

            if(node.right==null && node.left!=null) System.out.print(node.left.data);
            if(node.left==null && node.right!=null) System.out.print(node.right.data);

            printChildNode(node.left);
            printChildNode(node.right);

        }


    }

    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();
        Node root=tree.createBinaryTree();

        tree.printChildNode(root);
    }
}
