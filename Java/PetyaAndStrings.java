package Codeforces;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(solve(s1, s2));
        solve1();
        sc.close();
    }

    static int solve(String s1, String s2) {
        return (int) Math.signum(s1.compareToIgnoreCase(s2));
    }

    static void solve1(){
        Scanner in = new Scanner(System.in);
        String first1 = in.next();
        String second1 = in.next();

        String first = first1.toLowerCase();
        String second = second1.toLowerCase();

        //System.out.println(first.compareTo(second));

        if(first.compareTo(second) ==0){
            System.out.println("0");
        }
        if(first.compareTo(second) > 0){
            System.out.println("1");
        }
        if(first.compareTo(second) < 0){
            System.out.println("-1");
        }
    }

    static void solve3(){
        Scanner sc=new Scanner(System.in);
        String first=sc.nextLine();
        String second=sc.nextLine();
        first= first.toLowerCase();
        second=second.toLowerCase();
        int value=0;
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==second.charAt(i)){
                continue;
            }else if(first.charAt(i)>second.charAt(i)){
                value=1;
                break;
            }else{
                value = -1;
            }
        }
        System.out.println(value);
    }
}
