package Codeforces.EightSep;

import java.util.Arrays;
import java.util.Scanner;

public class VasyatheHipster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int m=sc.nextInt();
        int noOfDiff= Math.min(n,m);
        int remainingSocks=Math.max(n,m)-noOfDiff;
        int count=0;
        if(remainingSocks>=2){
            count+=remainingSocks/2;
        }
        System.out.println(noOfDiff+" "+count);
    }
}
