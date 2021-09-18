package Codeforces.Sep18;

import java.util.Scanner;

public class TwoRegularPolygons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a%b==0?"YES":"NO");
        }
    }

}
