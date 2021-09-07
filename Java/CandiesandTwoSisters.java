package Codeforces.SevenSep;

import java.util.Scanner;

public class CandiesandTwoSisters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            int c=sc.nextInt();
            if(c>2){
                arr[i]= (c-c/2-1);
            }else {
                arr[i]=0;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
