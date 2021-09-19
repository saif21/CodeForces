package Codeforces.Sep19;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int s=sc.nextInt();
            System.out.println(solve(s));
        }
    }
    static int solve(int m){
        if(m<9){
            return 0;
        }
        while (m%10!=9){
            --m;
        }
        return m/10+1;
    }
}
