package Recursion;

public class P4_MaxOfArray {
    public static void main(String[] args) {
        int[] arr={10,40,70,20,11,100,22};
        int i=0;

        System.out.println(maxOfArray(arr,i));
    }

    private static int maxOfArray(int[] arr, int i) {

        if(i==arr.length-1){
            return arr[i];
        }

        int prevMax=maxOfArray(arr,i+1);

        return Math.max(prevMax,arr[i]);

    }
}
