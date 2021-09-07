package Codeforces.SevenSep;

import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        int []a =new int[n];
        int []b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
//        for(int i=1;i<n;i++){
//            if(arr[i-1][0]==arr[i][1]){
//                count+=1;
//            }
//        }
//        for(int i=1;i<n;i++){
//            if(arr[i-1][1]==arr[i][0]){
//                count+=1;
//            }
//        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && a[i]==b[j]){
                    count+=1;
                }
            }
        }

        System.out.println(count);
    }
}
