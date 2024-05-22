package Recursion;

import java.util.ArrayList;

public class P5_IndexOfOccurrence {
    public static void main(String[] args) {

        int[] arr={2,3,9,8,7,6,3,4,12,7,3,8};

        int target=3;
        int firstOccurrence=indexOfFirstOccurrence(arr,0,target);
        int lastOccurrence=indexOfLastOccurrence(arr,0,target);

        System.out.println(firstOccurrence);
        System.out.println(lastOccurrence);


        ArrayList<Integer> allIndices=indexOfAllIndices(arr,0,target);

        System.out.println(allIndices);
    }

    private static ArrayList<Integer> indexOfAllIndices(int[] arr, int i, int target) {

        ArrayList<Integer> ans=new ArrayList<>();

        if(i==arr.length) return ans;

        if(arr[i]==target){
            ans.add(i);
        }

        ArrayList<Integer> indicesFromLatterArray=indexOfAllIndices(arr,i+1,target);

        ans.addAll(indicesFromLatterArray);

        return ans;

    }

    private static int indexOfLastOccurrence(int[] arr, int i, int target) {

        if(i==arr.length) return -1;

        int indexFromLatterArray=indexOfLastOccurrence(arr,i+1,target);

        if(indexFromLatterArray != -1) return indexFromLatterArray;
        else if(arr[i]==target) return i;

        return -1;


    }

    private static int indexOfFirstOccurrence(int[] arr, int i,int target) {

        if(i==arr.length) return -1;

        if(arr[i]==target) return i;

        return indexOfFirstOccurrence(arr,i+1,target);
    }
}
