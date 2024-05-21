package Recursion;

public class P1_PrintDecreasing {
    public static void main(String[] args) {

        int n=10;

        printDecreasing(n);
    }

    private static void printDecreasing(int n) {

        if(n==0) return;

        System.out.print(n+" ");
        printDecreasing(n-1);
    }
}
