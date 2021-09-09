package SepNine;

import java.util.Scanner;

public class RequiredRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            arr[i]=solve(a,b,c);
        }
        for(int i: arr){
            System.out.println(i);
        }
    }
    //c mod a=b;
    static int solve(int a,int b,int c){
//        while(c%a!=b){
//            c=c-1;
//        }
//        return c;
        return b+(c-b)/a*a;
    }
}
