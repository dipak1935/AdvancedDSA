package BinaryTree;

import java.util.ArrayList;

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


        public boolean nodeToRoot2(Node root, int target){

            if(root==null) return false;

            if(root.data==target){
                arr.add(root.data);
                return true;
            }

            if(nodeToRoot2(root.left,target)){
                arr.add(root.data);
                return true;
            }

            if(nodeToRoot2(root.right,target)){
                arr.add(root.data);
                return true;
            }

            return false;
        }

        public ArrayList<Integer> nodeToRoot3(Node root, int target){


            ArrayList<Integer> ans=new ArrayList<>();

            if(root==null) return ans;

            if(root.data==target){
                ans.add(root.data);
                return ans;
            }

            ArrayList<Integer> tempLeft=nodeToRoot3(root.left,target);

            if(!tempLeft.isEmpty()){
                tempLeft.add(root.data);
                return tempLeft;
            }

            ArrayList<Integer> tempRight=nodeToRoot3(root.right,target);

            if(!tempLeft.isEmpty()){
                tempLeft.add(root.data);
                return tempLeft;
            }
            else if(!tempRight.isEmpty()){
                tempRight.add(root.data);
                return tempRight;
            }

            return ans;

        }

        public boolean nodeToRoot4(Node root, int target,ArrayList<Integer> temp){

            if(root==null) return false;

            if(root.data==target){
                temp.add(root.data);
                return true;
            }

            boolean fromLeft=nodeToRoot4(root.left,target,temp);
            boolean fromRight=nodeToRoot4(root.right,target,temp);

            if(fromLeft||fromRight){
                temp.add(root.data);
                return true;
            }

            return false;

        }

        public static void main(String[] args) {

            BinaryTree tree=new BinaryTree();

            Node root=tree.createBinaryTree();


            System.out.println(tree.nodeToRoot2(root,70));

            ArrayList<Integer> temp=new ArrayList<>();

            System.out.println(tree.nodeToRoot4(root,70,temp));

            System.out.println(temp);

            System.out.println(tree.nodeToRoot3(root,70));


        }







    }
}
