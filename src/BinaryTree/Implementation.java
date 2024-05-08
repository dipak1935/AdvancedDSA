package BinaryTree;

import java.util.Scanner;

public class Implementation {

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

        Scanner sc=new Scanner(System.in);

        public void populate(){
            System.out.print("Enter the root Node : ");
            int value=sc.nextInt();
            root=new Node(value);

            populate(root);
        }

        protected void populate(Node node){
            System.out.println("Do you want insert element on the left side of "+node.data+" (ans in 0 or 1)");
            int left=sc.nextInt();

            if(left==1){
                System.out.println("Enter the element : ");
                int value=sc.nextInt();

                Node a=new Node(value);
                node.left = a;

                populate(node.left);
            }

            System.out.println("Do you want insert element on the right side of "+node.data+" (ans in 0 or 1)");
            int right=sc.nextInt();

            if(right==1){

                System.out.println("Enter the element : ");
                int value=sc.nextInt();

                node.right=new Node(value);
                populate(node.right);
            }
        }

//        public void display(){
//            display(root,"");
//
//        }
//        private void display(Node node, String indent){
//
//            if(node==null) return;
//
//            System.out.println(indent+node.data);
//
//            display(node.left,indent+"\t");
//            display(node.right,indent+"\t");
//
//        }

        private void display(Node node){

            if(node == null) return;

            String str="";
            str+=node.left==null?"." : node.left.data+"";
            str+="<-"+node.data+"->";
            str+=node.right==null?"." : node.right.data+"";
            System.out.println(str);


            display(node.left);
            display(node.right);
        }
    }


    public static void main(String[] args) {

        BinaryTree bt=new BinaryTree();

        bt.populate();
//
//        bt.display();


        bt.display(bt.root);





    }

}


