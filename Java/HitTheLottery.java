package Codeforces.SevenSep;

import java.util.Scanner;

public class HitTheLottery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();int count=0;
        while(n>0){
            if(n>=100){
                int q=n/100;
                int rem=n%100;
                count+=q;
                n=rem;
            }else if(n>=20){
                int q=n/20;
                int rem=n%20;
                count+=q;
                n=rem;
            }else if(n>=10){
                int q=n/10;
                int rem=n%10;
                count+=q;
                n=rem;
            }else if(n>=5){
                int q=n/5;
                int rem=n%5;
                count+=q;
                n=rem;
            }else{
                int q=n/1;
                int rem=n%1;
                count+=q;
                n=rem;

            }
        }
        System.out.println(count);
    }
}
