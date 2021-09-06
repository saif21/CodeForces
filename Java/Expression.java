package Codeforces.SixSep;

import java.util.Arrays;
import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println(solve(a,b,c));

    }
    static int solve(int a,int b, int c){
        return Arrays.stream(new int[]{a+b+c,a+b*c,(a+b)*c,a * b + c, a * (b + c), a * b * c }).max().getAsInt();
    }
}
