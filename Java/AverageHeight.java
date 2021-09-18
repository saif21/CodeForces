package Codeforces.Sep18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageHeight {
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
    static String solve(int []arr){
        StringBuilder s=new StringBuilder();

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                s.append(arr[i]+" ");
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                s.append(arr[i]+" ");
            }
        }
        return s.toString();
    }
}
