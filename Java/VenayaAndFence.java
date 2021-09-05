package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class VenayaAndFence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solve(arr,h));
    }
    static int solve(int[]arr,int h){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=h){
                count+=1;
            }else{
                count+=2;
            }
        }
        return count;
    }
    static int solve1(int[] a, int h) {
        return Arrays.stream(a).map(x -> (x <= h) ? 1 : 2).sum();
    }
}
