package SepNine;

import java.util.Scanner;

public class MinimalSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int min=Math.min(a,b);
            int max=Math.max(a,b);
            arr[i]=Math.max(min*2,max)*Math.max(min*2,max);
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
