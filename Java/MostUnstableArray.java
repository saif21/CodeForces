package Sep10;

import java.util.Scanner;

public class MostUnstableArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            arr[i]=solve(a,b);
        }
        for(int i: arr){
            System.out.println(i);
        }
    }
    static int solve(int n,int m){
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return m;
        } else {
            return m * 2;
        }
    }
}
