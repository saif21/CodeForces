package Codeforces.Sep14;

import java.util.Scanner;

public class ThereAreTwoTypesOfBurgers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
          int b=sc.nextInt();
          int p=sc.nextInt();
          int f=sc.nextInt();
          int h=sc.nextInt();
          int c=sc.nextInt();
          System.out.println(solve(b,p,f,h,c));
        }
    }

    static int solve(int b, int p, int f, int h, int c){
        return Math.max(compute(b,p,f,h,c),compute(b,f, p,c, h));
    }

    static int compute(int a, int b, int c, int d, int e){
        int unit1=Math.min(a/2,b);
        int unit2=Math.min(a/2-unit1, c);
        return unit1*d+unit2*e;
    }
}
/*3
15 2 3
5 10
7 5 2
10 12
1 100 100
100 100*/
