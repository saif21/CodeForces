package Codeforces.Sep13;

import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(solve(s));
    }
    static int solve(String s){
        char start='a';
        int sum=0;
        for(int i=0;i<s.length();i++){
            int l1=Math.abs(s.charAt(i)-start);
            int l2=26-l1;
            sum+=Math.min(l1,l2);
            start = s.charAt(i);
        }
        return sum;
    }
}
