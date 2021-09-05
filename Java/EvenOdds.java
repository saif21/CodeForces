package Codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int input1=sc.nextInt();
        int []arr={};
        for(int i=1;i<=input;i++){
            if(i%2==1){
                arr = Arrays.copyOf(arr, arr.length + 1);
                arr[arr.length - 1] = i;
            }
        }
        for (int j=2;j<=input;j++) {
            if (j % 2 == 0) {
                arr = Arrays.copyOf(arr, arr.length + 1);
                arr[arr.length - 1] = j;
            }
        }
        System.out.println(arr[input1-1]);
    }
}

class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();
        System.out.println(solve(n, k));

        sc.close();
    }

    static long solve(long n, long k) {
        //if k is odd
        if (k <= (n + 1) / 2) {
            return k * 2 - 1;
        //if k is even
        } else {
            return (k - (n + 1) / 2) * 2;
        }
    }
}

