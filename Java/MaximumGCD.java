package Sep10;

import java.util.Scanner;

public class MaximumGCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            System.out.println(solve(a));
        }
    }
    static int solve(int a){

        return a/2;
    }
}
