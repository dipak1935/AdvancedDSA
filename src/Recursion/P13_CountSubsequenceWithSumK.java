package Recursion;

public class P13_CountSubsequenceWithSumK {

    public static void main(String[] args) {

        int[] arr={5, 2, 3, 10, 8, 6}; // {5,2,3} , {10}, {2,8}
        int sum=10;
        int currSum=0;

        countSub(arr,0,currSum,sum);

        System.out.println(count);

    }

    private static void countSub(int[] arr, int i, int currSum, int sum) {

        currSum+=arr[i];

        if(i==arr.length || currSum>sum) return;

        if(currSum==sum){
            count++;
            return;
        }

        countSub(arr,i+1,currSum-arr[i],sum);
        countSub(arr,i+1, currSum,sum);

    }

    public static int count=0;
}
