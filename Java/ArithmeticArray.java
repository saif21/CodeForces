package Codeforces.Sep15;

import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            int []arr=new int[m];
            for(int j=0;j<m;j++){
                arr[j]=sc.nextInt();
            }
            System.out.println((int)solve(arr));
        }
    }
    static int solve(int[] a) {
        int diff = Arrays.stream(a).sum() - a.length;
        if (diff < 0) {
            return 1;
        } else if (diff > 0) {
            return diff;
        } else {
            return 0;
        }
    }
}
