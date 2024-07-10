package BinaryTree;

import java.util.Stack;

public class Constructor {
    public static class Node{
        int data;
        Node left=null;
        Node right=null;

        Node(int data){
            this.data=data;
        }
    }
    public static class Pair{

        Node node;
        int state;

        Pair(Node node,int state){
            this.node=node;
            this.state=state;
        }
    }
    public void display(Node node){

        if(node==null){
            System.out.println("null");
            return;
        }
        System.out.println(node.data);
        display(node.left);
        display(node.right);


//        if(node == null) return;
//
//        String str="";
//        str+=node.left==null?"." : node.left.data+"";
//        str+="<-"+node.data+"->";
//        str+=node.right==null?"." : node.right.data+"";
//        System.out.println(str);
//
//
//        display(node.left);
//        display(node.right);

    }

    public static void main(String[] args) {

        Integer[] nodes={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};


        Node root=new Node(nodes[0]);

        Pair rootPair=new Pair(root,1);

        Stack<Pair> st=new Stack<>();
        st.push(rootPair);

        int i=1;
        while (!st.isEmpty()){

            Pair top=st.peek();

            if(top.state==1){
                if(nodes[i]!=null){
                    Node curr=new Node(nodes[i]);
                    top.node.left=curr;

                    st.push(new Pair(curr,1));
                }
                i++;
                top.state++;

            }
            else if(top.state==2){
                if(nodes[i]!=null){
                    Node curr=new Node(nodes[i]);
                    top.node.right=curr;

                    st.push(new Pair(curr,1));
                }
                i++;
                top.state++;
            }
            else{
                st.pop();
            }

        }

        Constructor cc=new Constructor();

        cc.display(root);

    }
}
