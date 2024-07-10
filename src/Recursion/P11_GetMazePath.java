package Recursion;

import java.util.ArrayList;

public class P11_GetMazePath {
    public static void main(String[] args) {

        int sr=1;
        int sc=1;
        int dr=3;
        int dc=3;

        System.out.println(getMazePaths(sr,sc,dr,dc));

    }
    public static ArrayList<String> getMazePaths(int sr,int sc,int dr,int dc){

        ArrayList<String> paths=new ArrayList<>();



        ArrayList<String> rightPath=getMazePaths(sr+1,sc,dr,dc);
        ArrayList<String> downPath=getMazePaths(sr,sc+1,dr,dc);

        return paths;

    }
}
