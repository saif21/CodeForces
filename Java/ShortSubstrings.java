package Codeforces.EightSep;

import java.util.Scanner;

public class ShortSubstrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String []output=new String[n];
        for(int i=0;i<n;i++){
            String s=sc.next();
            output[i]=solve(s);
        }
        for (String sss:output){
            System.out.println(sss);
        }

    }
    static String solve(String s){
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i==0 || i%2!=0){
                ss.append(s.charAt(i));
            }
        }
        return ss.toString();
    }
}
