package Codeforces.Sep20;

import java.util.Scanner;

public class StartUp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String mirrored="AHIMOTUVWXY";
        StringBuilder ss=new StringBuilder();
        ss.append(s);
        boolean b=true;
        if(s.length()>0) {
            for(char i:s.toCharArray()){
                if(!mirrored.contains(String.valueOf(i))){
                   b=false;
                   break;
                }
            }
            if(b==true){
                System.out.println(ss.reverse().toString().equals(s)?"YES":"NO");
            }else {
                System.out.println("NO");
            }
        }
    }
}
