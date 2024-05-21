package Recursion;

public class P2_PowerFxn {
    public static void main(String[] args) {

        double x=4;
        float n=0.5f;

        double ans=powerFxn(x,n);
        System.out.println(ans);
    }

    private static double powerFxn(double x, float n) {

        if(n==1) return x;

        double val=powerFxn(x,n/2);

        if(n%2==0) return val*val;

        return val*val*x;
    }
}
