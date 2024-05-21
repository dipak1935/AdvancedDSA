package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class P12_RemoveLeaves {
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

            Node a=new Node(50);
            Node b=new Node(25);
            Node c=new Node(75);
            Node d=new Node(12);
            Node e=new Node(37);
            Node f=new Node(62);
            Node g=new Node(87);
            Node h=new Node(30);
            Node i=new Node(40);
            Node j=new Node(60);
            Node k=new Node(70);

            a.left=b;
            a.right=c;

            b.left=d;
            b.right=e;

            c.left=f;
            c.right=g;

            e.left=h;
            e.right=i;

            f.left=j;
            f.right=k;

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

        public Node removeLeaves(Node node){

            if(node==null) return null;


            if(node.left==null && node.right==null) return null;


            Node fromLeft=removeLeaves(node.left);
            Node fromRight=removeLeaves(node.right);

            node.left=fromLeft;
            node.right=fromRight;

            return node;

        }


    }

    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();
        Node root=tree.createBinaryTree();

        tree.display(tree.removeLeaves(root));


    }
}


