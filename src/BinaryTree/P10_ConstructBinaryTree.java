package BinaryTree;

import java.util.Stack;

public class P10_ConstructBinaryTree {
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }

    public static class  Pair{
        Node node;
        int val;

        Pair(Node node,int val){
            this.node=node;
            this.val=val;
        }
    }
    public static class BinaryTree{

        public Node constructBinaryTree(Integer[] arr){

            Node root=new Node(arr[0]);

            Stack<Pair> st=new Stack<>();
            st.push(new Pair(root,1));

            int i=1;
            while (!st.isEmpty()){

                Pair top=st.peek();

                if(top.val==1){
                    if(arr[i]!=null){
                        Node a=new Node(arr[i]);
                        top.node.left=a;
                        st.push(new Pair(a,1));
                    }
                    i++;
                    top.val++;
                }
                else if(top.val==2){
                    if(arr[i]!=null){
                        Node a=new Node(arr[i]);
                        top.node.right=a;
                        st.push(new Pair(a,1));
                    }
                    i++;
                    top.val++;
                }
                else st.pop();
            }
            return root;
        }
        public void displayTree(Node root){

            if(root==null) return;

            System.out.print(root.data+" ");

            displayTree(root.left);
            displayTree(root.right);

        }
    }

    public static void main(String[] args) {

        Integer[] arr={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};

        BinaryTree tree=new BinaryTree();

        Node root=tree.constructBinaryTree(arr);

        tree.displayTree(root);

    }
}
