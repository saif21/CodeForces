package Codeforces;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=new int[n][2];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            arr[i][0]=x;
            arr[i][1]=y;
        }
        System.out.println(solve(arr));
    }
    static int solve(int[][]arr){
        int maxcapcity=arr[0][1];
        int n=maxcapcity;
        for(int i=1;i<arr.length;i++){
            int x=Math.abs(n-arr[i][0]);
            int y=x+arr[i][1];
            if(y>maxcapcity){
                maxcapcity=y;
            }
        }
        return maxcapcity;
    }
}
//Another Solution;
class Solution{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []x=new int[n];
        int []y=new int[n];
        for(int i=0;i<n;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        System.out.println(solve(x,y));

    }
    static int solve(int[]x,int[]y){
        int maxCapacity=0;
        int passenger=0;
        for(int i=0;i<x.length;i++){
            passenger+=y[i]-x[i];
            maxCapacity=Math.max(passenger,maxCapacity);
        }
        return maxCapacity;
    }
}
