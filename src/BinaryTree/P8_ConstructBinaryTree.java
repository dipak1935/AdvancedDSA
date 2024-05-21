package BinaryTree;

public class P8_ConstructBinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    public Node createBinaryTreeInorder(){

        return new Node(4);
    }
    public Node createBinaryTreePreorder(){

        return new Node(4);
    }
    public Node createBinaryTreePostorder(){

        return new Node(4);
    }

    public static void main(String[] args) {

        int[] in={40,20,50,10,60,30};
        int[] pre={10,20,40,50,30,60};





    }
}
