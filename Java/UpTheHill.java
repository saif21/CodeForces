package Codeforces.Sep20;

import java.util.Scanner;

public class UpTheHill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(solve(n,m));
    }
    static String solve(int u, int d){
        StringBuilder res = new StringBuilder();
        int n=u+d+1;

        for (int i = 1; i <= u; i++) {
            res.append(i + " ");
        }
        res.append(n + " ");
        for (int i = n - 1; i > u; i--) {
            res.append(i + " ");
        }

        return res.toString();
    }
}
