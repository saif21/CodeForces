package Codeforces.Sep13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FavoriteSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            int []arr=new int[m];
            for(int j=0;j<m;j++){
                arr[j]=sc.nextInt();
            }
//            for(int x:solve(arr)){
//                System.out.print(x+" ");
//            }
            System.out.println(Arrays.stream(solve(arr)).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
        }
    }
    static int []solve(int[]arr){
        int []res=new int[arr.length];
        if(arr.length==1 || arr.length==2){
            return arr;
        }else {
            int i=0; int n=arr.length-1;int x=0;
           while(i<arr.length-1){
                res[i]=arr[x];
                res[i+1]=arr[n];
                i+=2;n-=1;x+=1;
           }
           if(arr.length%2==1){
               res[arr.length-1]=arr[arr.length/2];
           }
        }
        return res;
    }
}
