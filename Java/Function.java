package Codeforces.SixSep;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long output=0;
        long input=sc.nextLong();

        System.out.println(solve(input));
    }
    static long solve(long n){
        return (n/2-(n%2==0?0:n));
    }
}
