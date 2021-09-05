package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class HQ9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(solve(s)?"YES":"NO");
    }
    static boolean solve(String s){
        return s.contains("H")||s.contains("Q")||s.contains("9")||s.contains("+");

    }
}
