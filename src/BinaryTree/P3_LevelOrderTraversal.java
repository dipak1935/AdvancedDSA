package BinaryTree;

import java.util.ArrayDeque;
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
        public void displayLevelOrder(Node node){

            // rpa-> remove print add children algo

            Queue<Node> temp=new ArrayDeque<>();
            temp.add(root);

            while (!temp.isEmpty()){

                int size=temp.size();

                for (int i=0;i<size;i++){
                    node=temp.remove();
                    System.out.print(node.data+" ");

                    if(node.left!=null) temp.add(node.left);
                    if(node.right!=null) temp.add(node.right);
                }

                System.out.println();
            }


            // answer in same line
//            Queue<Node> queue = new LinkedList<Node>();
//            queue.add(root);
//            while (!queue.isEmpty()) {
//
//                // poll() removes the present head.
//                Node tempNode = queue.poll();
//                System.out.print(tempNode.data + " ");
//
//                // Enqueue left child
//                if (tempNode.left != null) {
//                    queue.add(tempNode.left);
//                }
//
//                // Enqueue right child
//                if (tempNode.right != null) {
//                    queue.add(tempNode.right);
//                }
//            }

        }

    }

    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();
        Node root=tree.createBinaryTree();


        tree.displayLevelOrder(root);
    }
}
