package Codeforces.Sep13;

import java.util.Scanner;

public class VusTheCossackAndAContest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(solve(a,b,c)?"YES":"NO");
    }
    static boolean solve(int a, int b, int c){
        return (b>=a&&c>=a);
    }
}
