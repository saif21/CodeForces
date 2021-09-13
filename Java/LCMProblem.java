package Codeforces.Sep13;

import java.util.Scanner;

public class LCMProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(solve(a,b));
        }
    }
    static String solve(int l, int r) {
        return (l * 2 <= r) ? String.format("%d %d", l, l * 2) : "-1 -1";
    }
}
