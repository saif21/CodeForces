package Codeforces.Sep13;

import java.util.Scanner;

public class DislikeOfThrees {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            System.out.println(solve(a));
        }
    }
    static int solve(int n){
        int res=0;
        for(int i=0;i<n;i++){
            ++res;
            while(res%3==0||res%10==3){
                res++;
            }
        }

        return  res;
    }
}
