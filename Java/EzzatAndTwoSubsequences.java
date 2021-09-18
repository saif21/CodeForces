package Codeforces.Sep18;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class EzzatAndTwoSubsequences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            int []arr=new int[m];
            for(int j=0;j<m;j++){
                arr[j]=sc.nextInt();
            }
            System.out.println(String.format("%.9f",solve(arr)));
        }
    }
    static double solve(int []arr){
        int max=Arrays.stream(arr).max().getAsInt();
        long sum=Arrays.stream(arr).asLongStream().sum()-max;

        return max+sum/(arr.length-1.0);
    }
}
