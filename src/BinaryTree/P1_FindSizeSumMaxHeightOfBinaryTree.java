package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class P1_FindSizeSumMaxHeightOfBinaryTree {
    public static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
        }
    }
    public static class BinaryTree{

        Node root=null;

        Node createBinaryTree(){
            Node a=new Node(50);
            Node b=new Node(25);
            Node c=new Node(75);
            Node d=new Node(12);
            Node e=new Node(37);

            Node f=new Node(62);
            Node g=new Node(87);
            Node h=new Node(30);
            Node i=new Node(70);


            a.left=b;
            a.right=c;

            b.left=d;
            b.right=e;

            c.left=f;
            c.right=g;

            e.left=h;
            f.right=i;


            return a;
        }
        public int size(Node root){

            if(root==null){
                return 0;
            }

            int leftSize=size(root.left);
            int rightSize=size(root.right);

            return leftSize+rightSize+1;
        }
        public int max(Node root){

            if(root==null) return Integer.MIN_VALUE;

            int leftMax=max(root.left);
            int rightMax=max(root.right);

            return Math.max(Math.max(leftMax,rightMax),root.data);
        }

        public int sum(Node root){

            if(root==null) return 0;

            return sum(root.left)+sum(root.right)+root.data;
        }

        public int height(Node root){

            if(root==null) return 0;

            return Math.max(height(root.left),height(root.right))+1;
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

    }

    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();
        Node root=tree.createBinaryTree();

//        System.out.println(tree.size(root));
//        System.out.println(tree.max(root));
//        System.out.println(tree.sum(root));

        tree.display(root);
        System.out.println(tree.height(root));

    }
}
