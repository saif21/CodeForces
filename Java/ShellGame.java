package Codeforces.Sep20;

import java.util.Scanner;

public class ShellGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k;
        while(true){
            k=n;
            for(int i=0;i<3;i++){
                int l=sc.nextInt();
                int r=sc.nextInt();
                if(k==l){
                    k=r;
                }else if(k==r){
                    k=l;
                }
            }break;
        }
        System.out.println(k);
    }
}
