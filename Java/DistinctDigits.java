package Codeforces.Sep14;

import java.util.Scanner;
import java.util.stream.IntStream;

public class DistinctDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(solve(n,m));
    }
    static int solve(int n, int m){
        for(int i=n;i<=m;i++){
            String s=String.valueOf(i);
            if(s.chars().distinct().count()==s.length()){
                return i;
            }
        }
        return -1;
    }
}
