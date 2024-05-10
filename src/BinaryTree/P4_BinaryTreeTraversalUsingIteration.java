package BinaryTree;

import java.util.*;

public class P4_BinaryTreeTraversalUsingIteration {
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
        void iterativePrePostInTraversal(Node root){

            Stack<Pair> st=new Stack<>();
            Pair rootPair=new Pair(root,1);

            st.push(rootPair);

            String preOrder="PreOrder : ";
            String inOrder="InOrder : ";
            String postOrder="PostOrder : ";

            while (!st.isEmpty()){

                Pair curr=st.peek();

                if(curr.val==1){

                    preOrder+=curr.node.data+" ";
                    if(curr.node.left!=null) st.push(new Pair(curr.node.left,1));
                    curr.val++;

                }
                else if(curr.val==2){
                    inOrder+=curr.node.data+" ";

                    if(curr.node.right!=null) st.push(new Pair(curr.node.right,1));
                    curr.val++;
                }
                else{
                    postOrder+=curr.node.data+" ";

                    st.remove(curr);
                }
            }

            System.out.println(preOrder);
            System.out.println(inOrder);
            System.out.println(postOrder);




        }
        public static class Pair{
            private Node node;
            private int val;

            Pair(Node node,int val){
                this.node=node;
                this.val=val;
            }
        }


    }
    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();
        Node root=tree.createBinaryTree();

        tree.iterativePrePostInTraversal(root);

        


    }
}
