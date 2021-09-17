package Codeforces.Sep17;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PatrickAndShopping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(solve(a,b,c));
    }
    static int solve(int a, int b, int c){
        int []arr=Arrays.stream(new int[]{a,b,c}).sorted().toArray();
        return Math.min((arr[0]*2+arr[1]*2), Arrays.stream(arr).sum());

    }
}
