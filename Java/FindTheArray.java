package Codeforces.Sep18;

import java.util.Scanner;

public class FindTheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            System.out.println(solve(m));
        }
    }
    static int solve(int m){
        int total=0;int num=1;
        while(m>0){
            total++;
            m-=num;
            num+=2;
        }
        return total;
    }
}
