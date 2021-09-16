package Codeforces.Sep15;

import java.util.Scanner;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solve(arr));
    }
    static int solve(int []arr){
        if(arr.length==1){
            return 0;
        }
        int res=0;int temp=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                temp++;
                res=Math.max(temp,res);
            }else {
                res=Math.max(temp,res);
                temp=1;
            }
        }
        return res;
    }
}
