package Codeforces.Sep19;

import java.util.Scanner;
import java.util.stream.IntStream;

public class BalancedSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            String s=sc.next();
            System.out.println(solve(s));
        }
    }
    static String solve(String s){
        int l=-1;int r=-1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
               l=i+1;r=i+2;
               break;
            }
        }
        return String.format("%d %d",l,r);
    }
}
