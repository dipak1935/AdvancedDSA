package Recursion;

import java.util.ArrayList;

public class P10_GetStairsPath {
    public static ArrayList<String> ans=new ArrayList<>();
    public static void main(String[] args) {

        int n=5;

        getStairsPath(n,"");

        System.out.println(ans);


        System.out.println(getStairsPath2(5));

    }

    private static void getStairsPath(int n,String path) {

        if(n<0) return;

        if(n==0){
            ans.add(path);
            return;
        }

        getStairsPath(n-1,path+1);
        getStairsPath(n-2,path+2);
        getStairsPath(n-3,path+3);

    }
    private static ArrayList<String> getStairsPath2(int n){

        ArrayList<String> paths=new ArrayList<>();

        if(n==0){
            ans.add("");

            return ans;
        }
        else if(n<0){
            return ans;
        }

        ArrayList<String> path1=getStairsPath2(n-1);
        ArrayList<String> path2=getStairsPath2(n-2);
        ArrayList<String> path3=getStairsPath2(n-3);

        for(String path:path1){
            paths.add(1+path);
        }
        for(String path:path2){
            paths.add(2+path);
        }
        for(String path:path3){
            paths.add(3+path);
        }

        return paths;
    }
}
