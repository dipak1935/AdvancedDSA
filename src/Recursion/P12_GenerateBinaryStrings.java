package Recursion;

import java.util.ArrayList;

public class P12_GenerateBinaryStrings {
    public static void main(String[] args) {

        // Given an integer, K. Generate all binary strings of size k without consecutive 1’s.

        int k=4;

        ArrayList<String> ans=generateBS(k);
        System.out.println(ans);

    }

    private static ArrayList<String> generateBS(int k) {

        ArrayList<String> ans=new ArrayList<>();

        if(k==1){
            ans.add("0");
            ans.add("1");
            return ans;
        }

        ArrayList<String> temp=generateBS(k-1);

        for(String s:temp){
            if(s.charAt(0)=='0'){
                ans.add('0'+s);
                ans.add('1'+s);
            }
            else{
                ans.add('0'+s);
            }
        }

        return ans;

    }
}
