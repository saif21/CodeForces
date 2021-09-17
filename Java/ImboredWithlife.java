package Codeforces.Sep17;

import java.util.Scanner;

public class ImboredWithlife {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(solve(x,y));
    }


    static int solve(int x, int y){
       int min=Math.min(x,y);
       int res=1;
       while(min>0){
           res*=min;
           min--;
       }
       return res;
    }
}
//
//    static int factorial(int n){
//        int res=1;
//        for(int i=1;i<=n;i++){
//            res*=i;
//        }
//        return res;
//    }
//
//    static int gcd(int x,int y){
//        if(y==0){
//            return x;
//        }
//        return gcd(y,x%y);
//    }
