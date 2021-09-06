package Codeforces.SixSep;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class KefaFirstStep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solve(arr));
    }
    static int solve(int[] a) {
        int maxLength = 0;
        int length = 0;
        for (int i = 0; i < a.length; i++) {
            if (i != 0 && a[i] >= a[i - 1]) {
                length++;
            } else {
                length = 1;
            }

            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}
