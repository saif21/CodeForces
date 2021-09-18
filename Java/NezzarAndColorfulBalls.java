package Codeforces.Sep18;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class NezzarAndColorfulBalls {
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
    static int solve(int []arr){
        if(arr.length==1){
            return 1;
        }
        int res=0; int temp=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                temp+=1;
                res=Math.max(temp,res);
            }else {
                temp=0;
            }
        }
        return res+1;
    }
}
