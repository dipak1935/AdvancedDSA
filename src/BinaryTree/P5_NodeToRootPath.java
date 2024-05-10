package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class P5_NodeToRootPath {
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

            e.left=h;
            f.right=i;


            return root;
        }
        public
        ArrayList<Integer> arr=new ArrayList<>();
        public boolean nodeToRoot(Node root,int node){

            if(root==null) return false;

            if(root.data==node){
                arr.add(root.data);
                return true;
            }

            boolean foundInLeft=nodeToRoot(root.left,node);
            if(foundInLeft){
                arr.add(root.data);
                return true;
            }

            boolean foundInRight=nodeToRoot(root.right,node);
            if(foundInRight){
                arr.add(root.data);
                return true;
            }

            return false;
        }
        public static void main(String[] args) {

            BinaryTree tree=new BinaryTree();

            Node root=tree.createBinaryTree();


            System.out.println(tree.nodeToRoot(root,70));
            System.out.println(tree.arr);
        }







    }
}
