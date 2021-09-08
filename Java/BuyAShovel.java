package Codeforces.EightSep;

import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int m=sc.nextInt();
        boolean b=true;
        int count=0;
        int i=1;
        while(b){
            if((n*i)%10==0 || (n*i)%10==m){
                count+=1;
                b=false;
            }else {
                count+=1;
                i++;
            }
        }
        System.out.println(count);
    }
}
