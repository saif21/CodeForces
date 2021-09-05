package Codeforces;

import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(solve(n));
    }
    static String solve(int n){
        if(n%4==0||n%7==0){
            return "YES";
        }else {
            String s=Integer.toString(n);
            return (String.valueOf(n).length()==String.valueOf(n).chars().filter(i -> i=='4'|| i=='7').count()?"YES":"NO");
        }
    }
}
