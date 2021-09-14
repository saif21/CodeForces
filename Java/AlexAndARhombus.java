package Codeforces.Sep14;

import java.util.Scanner;

public class AlexAndARhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(solve(n));
    }
    static int solve(int n){
        int res=1;
        if(n==1){
            res=1;
        }else {
            for(int i=1;i<n;i++){
                res+=(i*4);
            }
        }
        return res;
    }
}
