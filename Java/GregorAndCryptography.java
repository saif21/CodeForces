package Codeforces.Sep18;

import java.util.Scanner;

public class GregorAndCryptography {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            System.out.println(solve(m));
        }
    }
    static String solve(int m){
        return String.format("2 %d",m-1);
    }
}
