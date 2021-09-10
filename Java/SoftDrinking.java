package Sep10;

import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();
        System.out.println(solve((k*l)/nl,c*d,p/np,n));
    }

    static int solve(int n, int m, int k,int nl){
        return Math.min(n,Math.min(m,k))/nl;
    }
}
