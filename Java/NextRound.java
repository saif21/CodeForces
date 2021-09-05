package Codeforces;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(result(m,arr));
        sc.close();
    }

    static int result(int l, int [] arr){
        int res=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>0 && arr[i]>=arr[l-1]){
                res++;
            }
        }
        return res;
    }
}
