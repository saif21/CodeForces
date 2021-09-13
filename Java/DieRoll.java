package Codeforces.Sep13;

import java.util.Scanner;

public class DieRoll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(solve(a,b));
    }
    static int gcd(int a, int b){
        return (b==0)?a:gcd(b,a%b);
    }
    static String solve(int a, int b){
        int numer=7-Math.max(a,b);
        int denom=6;
        int g=gcd(numer,denom);
        numer/=g;
        denom/=g;
        return String.format("%d/%d",numer,denom);
    }
}
