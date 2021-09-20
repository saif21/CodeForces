package Codeforces.Sep20;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        switch (s + n) {
            case "front1": System.out.println("L"); break;
            case "front2": System.out.println("R"); break;
            case "back1": System.out.println("R"); break;
            case "back2": System.out.println("L");
        }
    }

}
/*
static String solve(String s, int n){
        if(s.equals("front")){
            if(n==1){
                return "L";
            }else {
                return "R";
            }
        } else{
            if(n==1){
                return "R";
            }else {
                return "L";
            }
        }

    }
 */