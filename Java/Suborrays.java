package Codeforces.Sep17;

import java.util.Scanner;

public class Suborrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            solve(x);
        }
    }
    static void solve(int x){
        for(int i=1;i<=x;i++){
            System.out.print(i+" ");
        }
    }
}
