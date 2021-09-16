package Codeforces.Sep15;

import java.util.Scanner;

public class CPlusEqual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(solve(a,b,c));
        }
    }
    static int solve(int a, int b, int n) {
        if (a > b) {
            return solve(b, a, n);
        }
        if (a > n || b > n) {
            return 0;
        }

        return 1 + solve(a + b, b, n);
    }
}
