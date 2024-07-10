package Recursion;

import java.util.ArrayList;
import java.util.List;

public class P9_Permutations {
    public static void main(String[] args) {

        int[] nums={1,2,3};

        List<List<Integer>> ans=new ArrayList<>();

        permutation(nums,new ArrayList<>(),ans);

        System.out.println(ans);
    }
    public static void permutation(int[] nums,List<Integer> temp,List<List<Integer>> ans){


        if(temp.size()==nums.length){

            ans.add(new ArrayList<>(temp));

            return;

        }

        for(int num:nums){

            if(temp.contains(num)) continue;

            temp.add(num);
            permutation(nums,temp,ans);

            temp.removeLast();

        }
    }
}
