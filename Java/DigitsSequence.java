package Codeforces.Sep20;

import java.util.Scanner;

public class DigitsSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        for(int i=1;i<n+1;i++){
            s+=i;
        }
        System.out.println(s.charAt(n-1));
    }
}
