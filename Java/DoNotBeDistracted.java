package SepNine;

import java.util.ArrayList;
import java.util.Scanner;

public class DoNotBeDistracted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            sc.nextInt();
            String s=sc.next();
            System.out.println(solve(s)?"YES":"NO");
        }
        sc.close();
    }
    static boolean solve(String s){
       char[] x=s.toCharArray();
       ArrayList<Character>l=new ArrayList<Character>();
       char prev=0;
       for(char i:x){
           if(i!=prev && l.contains(i)){
               return false;
           }
           l.add(i);
           prev=i;
       }
       return true;
    }
}
