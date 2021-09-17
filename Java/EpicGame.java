package Codeforces.Sep16;

import java.util.Scanner;

public class EpicGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        solve(a,b,c);
    }
    static void solve(int a, int b, int c){
        while(true){
            c-=gcd(a,c);
            if(c==0){
               System.out.println("0");
               break;
            }
            c-=gcd(b,c);
            if(c==0){
                System.out.println("1");
                break;
            }
        }
    }
    static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
