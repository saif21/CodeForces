package Codeforces.Sep13;

import java.util.Scanner;

public class FloorNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(solve(a,b));
        }
    }
    static int solve(int a, int b){
        int res=0;
        if(a==1){
            res=1;
        }else{
            res=(int)Math.ceil((double) (a-2)/b)+1;
        }
        return res;
    }
}
