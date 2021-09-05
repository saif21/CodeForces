package Codeforces;

import java.util.Scanner;

public class NearlyLuckyDivision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
//        int s=(int)String.valueOf(Integer.parseInt(n)).chars().filter(i -> i=='4'|| i=='7').count();
//        if(s==4 || s==7){
//            System.out.println("YES");
//        }else {
//            System.out.println("NO");
//        }
        int count=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='4'|| n.charAt(i)=='7'){
                count+=1;
            }
        }
        if(count==4||count==7){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
