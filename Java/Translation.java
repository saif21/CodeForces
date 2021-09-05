package Codeforces;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String f=sc.nextLine();
        String s=sc.nextLine();
        StringBuilder revrse=new StringBuilder();
        revrse.append(f);
        revrse.reverse();
        System.out.println(revrse.toString());
        if(revrse.toString().equals(s)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        System.out.println(solve(f,s)?"YES":"NO");
    }
    static boolean solve(String f,String s){
        return s.equals(new StringBuilder(f).reverse().toString());
    }
}
