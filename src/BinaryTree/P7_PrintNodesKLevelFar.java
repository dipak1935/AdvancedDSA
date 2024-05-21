package BinaryTree;

import javax.swing.*;
import java.util.ArrayList;

public class P7_PrintNodesKLevelFar {
    public static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
        }
    }
    public static class BinaryTree {

        Node root = null;

        public Node createBinaryTree() {

            Node a = new Node(50);
            Node b = new Node(25);
            Node c = new Node(75);
            Node d = new Node(12);
            Node e = new Node(37);
            Node f = new Node(62);
            Node g = new Node(87);
            Node h = new Node(30);
            Node i = new Node(70);


            a.left = b;
            a.right = c;

            b.left = d;
            b.right = e;

            c.left = f;
            c.right = g;

            e.left = h;
            f.right = i;


            return a;
        }
        public void printKLevelFar(int data,int k,Node root){

            ArrayList<Node> path=nodeToRootPath(root,data);

            for(int i=0;i<path.size();i++){

                printKLevels(path.get(i),k-i, i==0?null:path.get(i-1));

            }
        }

        public void printKLevels(Node root, int k,Node block){

            if(root==null || k<0 || root==block) return;


            if(k==0) {
                System.out.print(root.data+" ");
                return;
            }


            printKLevels(root.left,k-1,block);
            printKLevels(root.right,k-1,block);

        }

        public ArrayList<Node> nodeToRootPath(Node root,int target){
            ArrayList<Node> ans=new ArrayList<>();

            if(root==null) return ans;

            if(root.data==target){
                ans.add(root);
                return ans;
            }

            ArrayList<Node> fromLeft=nodeToRootPath(root.left,target);
            if(!fromLeft.isEmpty()){
                fromLeft.add(root);
                return fromLeft;
            }

            ArrayList<Node> fromRight=nodeToRootPath(root.right,target);
            if(!fromLeft.isEmpty()){
                fromRight.add(root);
                return fromRight;
            }

            return ans;
        }
    }




    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();
        Node root=tree.createBinaryTree();


        tree.printKLevelFar(62,1,root);




    }
}
