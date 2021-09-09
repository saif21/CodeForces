package SepNine;

import java.util.Scanner;

public class PhoenixandBalance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            System.out.println(solve(a));
        }
    }
    //lower part to higher part and higher half to lower part.
    static int solve(int a){
        double d= Math.pow(2.0,a);
        double f=0;
        int x=a/2;
        for(int i=1;i<a;i++){
            if(i<x){
                d+=Math.pow(2.0,i);
            }else{
                f+=Math.pow(2.0,i);
            }
        }
        return (int) Math.abs(d-f);
    }
}
