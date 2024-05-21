package BinaryTree;

public class P9_PathToLeafFromRoot {
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

        public Node createBinaryTree(){

            Node a=new Node(50);
            Node b=new Node(25);
            Node c=new Node(75);
            Node d=new Node(12);
            Node e=new Node(37);
            Node f=new Node(62);
            Node g=new Node(87);
            Node h=new Node(30);
            Node i=new Node(40);
            Node j=new Node(60);
            Node k=new Node(70);

            a.left=b;
            a.right=c;

            b.left=d;
            b.right=e;

            c.left=f;
            c.right=g;

            e.left=h;
            e.right=i;

            f.left=j;
            f.right=k;

            return a;

        }
        public void pathToLeafFromRoot(Node node,String path,int sum,int hi,int low){

            if(node==null) return;

            sum+=node.data;
            path+=node.data+" ";

            if(node.left==null && node.right==null){
                if(sum>low && sum<hi){
                    System.out.println(path);
                    return;
                }
            }


//            pathToLeafFromRoot(node.left,path+node.data,sum+node.data,hi,low);
//            pathToLeafFromRoot(node.right,path+node.data,sum+node.data,hi,low);


            pathToLeafFromRoot(node.left,path,sum,hi,low);
            pathToLeafFromRoot(node.right,path,sum,hi,low);


        }

    }

    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();
        Node root=tree.createBinaryTree();

        tree.pathToLeafFromRoot(root,"",0,300,50);













    }
}
