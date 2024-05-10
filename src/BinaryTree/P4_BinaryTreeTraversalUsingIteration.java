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
            Map<Integer,Integer> pair=new HashMap<>();
            Stack<Pair> st=new Stack<>();
            Pair rootPair=new Pair(root,1);

            st.push(rootPair);

            while(!st.isEmpty()){
                Pair top=st.peek();
                if(top.right==1){
                    System.out.println("pre "+top.right);
                    top.right++;
                }
                else if(top.right==2){
                    System.out.println("In "+top.right);
                    top.right++;

                }
                else if(st.peek().right==3){
                    System.out.println("Post "+top.right);
                    st.remove(top);
                }
            }


        }
        public static class Pair{
            private Node left;
            private int right;

            Pair(Node left,int right){
                this.left=left;
                this.right=right;
            }
        }


    }
    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();
        Node root=tree.createBinaryTree();

        


    }
}
