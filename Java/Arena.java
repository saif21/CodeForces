package Codeforces.Sep18;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arena {
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
    static int solve(int[]arr){
        int res=0;
        int min= Arrays.stream(arr).min().getAsInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=min){
                res+=1;
            }
        }

        return res;
    }
}
