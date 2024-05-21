package Recursion;

public class P3_DisplayArray {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int i=0;

        displayArray(arr,i);

        System.out.println();

        displayReverseArray(arr,i);
    }

    private static void displayReverseArray(int[] arr, int i) {
        if(i==arr.length) return;

        displayReverseArray(arr,i+1);
        System.out.print(arr[i]+" ");
    }

    private static void displayArray(int[] arr, int i) {

        if(i==arr.length) return;

        System.out.print(arr[i]+" ");
        displayArray(arr,i+1);
    }
}
