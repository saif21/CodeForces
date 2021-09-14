package Codeforces.Sep14;

import java.util.Scanner;

public class RainbowDashFluttershy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            System.out.println(solve(m));
        }
    }
    static int solve(int m){
        return m/2+1;
    }
}
