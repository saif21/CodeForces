package Codeforces.SevenSep;

import java.util.Arrays;
import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();int n=sc.nextInt();
        int []a=new int[n];
        int []b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int count=0;
        insertionsort(a,b);

//        b=insertionsort(b);
        int strength=s;
        for(int i=0;i<n;i++){
            if(strength<=a[i]){
                count++;
                break;
            }else {
                strength+=b[i];
            }
        }
        System.out.println(count>0?"NO":"YES");
    }
    static int[] insertionsort(int[]arr,int []b){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int k=b[i];
            int j=i-1;
            while(j>=0 && key<arr[j]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                int temp2=b[j];
                b[j]=b[j+1];
                b[j+1]=temp2;
                j--;
            }
        }
        return arr;
    }
}
