package Codeforces.Sep19;

import java.util.Scanner;

public class AVarietyOfOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(solve(a,b));
        }
    }
    static int solve(int a, int b){
        if(a==0 && b==0){
            return 0;
        }
        if(a==b){
            return 1;
        }
        else if((a+b)%2==1){
            return -1;
        }else if((a+b)%2==0){
            return 2;
        }else{
            return 1;
        }
    }
}
/*
6
1 2
3 5
5 3
6 6
8 0
0 0
*/