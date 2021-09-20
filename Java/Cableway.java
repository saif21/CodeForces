package Codeforces.Sep20;

import java.util.Scanner;

public class Cableway {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int g=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(solve(r,g,b));
    }
    static int solve(int r,int g, int b){
        int max=0;
        if(r>0){
            int v=((r+1)/2-1)*3+30;
            max=Math.max(max,v);
        }
        if(g>0){
            int v=((g+1)/2-1)*3+30+1;
            max=Math.max(max,v);
        }
        if(b>0){
            int v=((b+1)/2-1)*3+30+2;
            max=Math.max(max,v);
        }
        return max;
    }
}
