package Recursion;

import java.util.ArrayList;

public class P7_GetKeypadCombination {




    public static void main(String[] args) {



        String str="67";

        String[] arr={",;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
        //                            0    1     2     3     4     5      6     7    8     9

        ArrayList<String> ans=getKeypadCombination(str,arr);

        System.out.println(ans);



    }

    private static ArrayList<String> getKeypadCombination(String str,String[] arr) {

        ArrayList<String> ans=new ArrayList<>();

        if(str.isEmpty()){
            ans.add("");
            return ans;
        }

        char ch=str.charAt(0);

        ArrayList<String> temp=getKeypadCombination(str.substring(1),arr);

        for(int i = 0; i<arr[ch-'0'].length(); i++){

            char c=arr[ch-'0'].charAt(i);

            for(String s:temp){
                ans.add(c+s);
            }

        }

        return ans;


    }
}
