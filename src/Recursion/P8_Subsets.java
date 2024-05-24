package Recursion;

import java.util.ArrayList;
import java.util.List;

public class P8_Subsets {
    public static void main(String[] args) {

        int[] arr={1,2,3};

        List<List<Integer>> ans=new ArrayList<>();

        subsets(arr,0,new ArrayList<>(),ans);

        System.out.println(ans);
    }
    public static void subsets(int[] arr,int i, List<Integer> temp, List<List<Integer>> ans){

        if(i==arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(arr[i]);
        subsets(arr,i+1,temp,ans);

        temp.remove(temp.size()-1);
        subsets(arr,i+1,temp,ans);

    }
}
