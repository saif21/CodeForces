package Codeforces.SevenSep;

import java.util.Scanner;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(solve(a,b));
    }
    static String solve(int a,int b){
        return (Math.min(a,b)%2==0)?"Malvika" : "Akshat";
    }
}
