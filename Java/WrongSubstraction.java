package Codeforces;

import java.util.Scanner;

public class WrongSubstraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int i=0;
        while(i<k){
            if(n%10!=0){
                n=n-1;
            }else {
                n=(n/10);
            }
            i+=1;
        }
        System.out.println(n);
    }
}
