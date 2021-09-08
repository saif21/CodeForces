package Codeforces.EightSep;

import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(untreated(arr));
    }
    static int untreated(int[]arr){
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<1){
                sum+=arr[i];
            }else {
                if(sum>0){
                    sum+=arr[i];
                }else {
                    sum=arr[i];
                }
            }
            if(sum<0){
                count+=1;
            }
        }
        return count;
    }
}
