package Recursion;

import java.util.ArrayList;

public class P6_GetSubsequence {
    public static void main(String[] args) {

        String str="abc";

        ArrayList<String> ans= getSubsequence(str);

//        System.out.println(ans);

    }

    private static ArrayList<String> getSubsequence(String str) {

        ArrayList<String> ans=new ArrayList<>();


        if(str.isEmpty()){
            ans.add("");
            System.out.println(ans);
            return ans;

        }

        char ch=str.charAt(0);

        ArrayList<String> temp=getSubsequence(str.substring(1));
        System.out.println(temp);

        for(String s:temp){

            ans.add("_"+s);
            ans.add(ch+s);
        }

        System.out.println(ans);

        return ans;

    }
}
