package Codeforces.SixSep;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Horseshoes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(4-solve(arr));
    }
    static int solve(int arr[]){
        return (int) Arrays.stream(arr).distinct().count();
    }
}
