package Codeforces.Sep19;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Cherry {
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
    static long solve(int[]a){
        return IntStream.range(0, a.length - 1)
                .mapToLong(i -> (long) a[i] * a[i + 1])
                .max()
                .getAsLong();
    }
}
