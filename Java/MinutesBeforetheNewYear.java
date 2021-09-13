package Codeforces.Sep13;

import java.util.Scanner;

public class MinutesBeforetheNewYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(solve(a,b));
        }
    }
    static int solve(int a,int b){
        return (23-a)*60+ 60-b;
    }
}
