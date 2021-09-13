package Codeforces.Sep13;

import java.util.Scanner;

public class FairPlayoff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            System.out.println(solve(a,b,c,d)?"YES":"NO");
        }
        sc.close();
    }
    static boolean solve(int a, int b, int c, int d){
        int MinA=Math.min(a,b);int MinB=Math.min(c,d);
        int MaxA=Math.max(a,b);int MaxB=Math.max(c,d);
        return MinA<MaxB && MinB<MaxA;
    }
}
