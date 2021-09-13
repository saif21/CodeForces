package Codeforces.Sep13;

import Chapter1.Party;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StoneGame {
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
    static int solve(int[] a) {
        int n = a.length;

        int min = Arrays.stream(a).min().getAsInt();
        int max = Arrays.stream(a).max().getAsInt();

        int[] extremeIndices = IntStream.range(0, n).filter(i -> a[i] == min || a[i] == max).toArray();

        return Math.min(
                Math.min(extremeIndices[1] + 1, n - extremeIndices[0]),
                extremeIndices[0] + 1 + n - extremeIndices[1]);
    }
}
