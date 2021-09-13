package Codeforces.Sep13;

import java.util.Scanner;

public class EhAbAnDgCd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int m=sc.nextInt();
            System.out.println(solve(m));
        }
    }
    static String solve(int x) {
        return String.format("1 %d", x - 1);
    }
}
