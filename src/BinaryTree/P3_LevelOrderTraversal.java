package BinaryTree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
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
            Node h = new Node(30);
            Node i = new Node(40);
            Node j = new Node(60);
            Node k = new Node(70);

            root = a;

            a.left = b;
            a.right = c;

            b.left = d;
            b.right = e;

            c.left = f;
            c.right = g;

            e.left=h;
            e.right=i;

            f.left=j;
            f.right=k;

            return root;
        }
        public void displayLevelOrder(Node node){

            // rpa-> remove print add children algo

//            Queue<Node> queue=new ArrayDeque<>();
//            queue.add(root);
//
//            while (!queue.isEmpty()){
//
//                int size=queue.size();
//
//                for (int i=0;i<size;i++){
//                    node=queue.remove();
//                    System.out.print(node.data+" ");
//
//                    if(node.left!=null) queue.add(node.lef);
//                    if(node.right!=null) queue.add(node.right);
//                }
//
//                System.out.println();
//            }


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


        tree.displayLevelOrder(root);
    }
}
