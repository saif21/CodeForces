package SepNine;

import java.util.Scanner;

public class BoringApartments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            System.out.println(solve(a));
        }
    }
    static int solve(int a){
        int b=1;int c=2;int d=3;int e=4;
        int count=0;
        if(a>1000){
            int rem=a/1111;
            count+=(rem)*10;
        }else if(a>100){
            int rem =a/111;
            count+=(rem-1)*10+6;
        }else if(a>10){
            int rem =a/11;
            count+=(rem-1)*10+3;
        }else {
            count+=(a-1)*10+1;
        }
        return count;
    }
//    static int solve(int x) {
//        String s = String.valueOf(x);
////        int l=s.charAt(0)-'9';
//        int m=s.charAt(0)-'0'-1;
//        System.out.println(s.length() * (s.length() + 1) / 2);
//        return 10 * (s.charAt(0) - '0' - 1) + s.length() * (s.length() + 1) / 2;
//    }
}
