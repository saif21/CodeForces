package Codeforces.Sep19;

import java.util.Arrays;
import java.util.Scanner;

public class MochaAndMath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            int []arr=new int[m];
            for(int j=0;j<m;j++){
                arr[j]=sc.nextInt();
            }
            System.out.println(solve(arr));
        }
    }
    static int solve(int []arr){
        return Arrays.stream(arr).reduce((x,y)->x&y).getAsInt();
    }
}
