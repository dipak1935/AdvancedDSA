package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class P13_DiameterOfABinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
        }
    }

    public static class BinaryTree{
        private Node root=null;

        public Node createBinaryTree(){

//            Node a=new Node(50);
//            Node b=new Node(25);
//            Node c=new Node(75);
//            Node d=new Node(12);
//            Node e=new Node(37);
//            Node f=new Node(62);
//            Node g=new Node(87);
//            Node h=new Node(30);
//            Node i=new Node(40);
//            Node j=new Node(60);
//            Node k=new Node(70);
//
//            a.left=b;
//            a.right=c;
//
//            b.left=d;
//            b.right=e;
//
//            c.left=f;
//            c.right=g;
//
//            e.left=h;
//            e.right=i;
//
//            f.left=j;
//            f.right=k;
//
//            return a;


            Node a=new Node(4);
            Node b=new Node(-7);
            Node c=new Node(-3);
            Node d=new Node(-9);
            Node e=new Node(-3);
            Node f=new Node(9);
            Node g=new Node(-7);
            Node h=new Node(-4);
            Node i=new Node(6);
            Node j=new Node(-6);
            Node k=new Node(-6);
            Node l=new Node(0);
            Node m=new Node(6);
            Node n=new Node(5);
            Node o=new Node(9);
            Node p=new Node(-1);
            Node q=new Node(-4);
            Node r=new Node(-2);

            a.left=b;
            a.right=c;

            c.left=d;
            c.right=e;

            d.left=f;
            d.right=g;

            e.left=h;

            f.left=i;

            g.left=j;
            g.right=k;

            i.left=l;
            i.right=m;

            j.left=n;

            k.left=o;

            l.right=p;

            m.left=q;

            o.left=r;

            return a;

        }
        private void display(Node node){

            Queue<Node> queue=new LinkedList<>();
            queue.add(node);

            while (!queue.isEmpty()){

                int size=queue.size();

                for(int i=0;i<size;i++){
                    Node temp=queue.poll();

                    System.out.print(temp.data+" ");

                    if(temp.left!=null) queue.add(temp.left);
                    if(temp.right!=null) queue.add(temp.right);

                }

                System.out.println();


            }
        }

        public int diameter(Node node){

            if(node==null) return 0;

            int leftDiameter=diameter(node.left);
            int rightDiameter=diameter(node.right);

            int sumOfLeftAndRightHeight=heightOfBT(node.left)+heightOfBT(node.right)+2;

            return Math.max(Math.max(leftDiameter,rightDiameter),sumOfLeftAndRightHeight);

        }

//        static class DiameterPair{
//            int height;
//            int diameter;
//
//        }
//        public static DiameterPair diameter2(Node node){
//            if(node ==null){
//                DiameterPair basePair=new DiameterPair();
//                basePair.height=-1;
//                basePair.diameter=0;
//
//                return basePair;
//            }
//
//            DiameterPair leftPair=diameter2(node.left);
//            DiameterPair rightPair=diameter2(node.right);
//
//            DiameterPair myPair=new DiameterPair();
//            myPair.height=Math.max(leftPair.height,rightPair.height)+1;
//
//            myPair.diameter=Math.max(leftPair.height+rightPair.height+2,Math.max(leftPair.diameter,rightPair.diameter));
//
//            return myPair;
//        }
//
        private int heightOfBT(Node node) {

            if(node==null) return -1;

            return Math.max(heightOfBT(node.left), heightOfBT(node.right))+1;

        }


    }

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        Node root=tree.createBinaryTree();

//        System.out.println(tree.diameter2(root));
//        tree.display(root);

        System.out.println(tree.diameter(root));
    }
}
