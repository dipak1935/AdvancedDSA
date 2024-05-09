package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

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

            // rpa-> remove print add children algo

            Queue<Node> temp=new LinkedList<>();
            temp.add(root);

            while (!temp.isEmpty()){

                while (!temp.isEmpty()){
                    System.out.print(temp.poll().data+" ");
                }

                if(root.left!=null) temp.add(root.left);
                if(root.right!=null) temp.add(root.right);

                System.out.println();
            }

        }

    }

    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();
        Node root=tree.createBinaryTree();


        tree.displayLevelOrder(root);
    }
}
