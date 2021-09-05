package Codeforces;

import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        System.out.println(solve(s));
    }
    static String solve(String s){
        int a=(int)s.chars().filter(ch -> ch=='A').count();
        int b=(int)s.chars().filter(ch -> ch=='D').count();

        if(a<b){
            return "Danik";
        }else if(a>b){
            return "Anton";
        }else{
            return "Friendship";
        }
    }
}
