package Codeforces.SevenSep;

import java.util.*;
import java.util.stream.IntStream;

public class Puzzles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []arr=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solve(arr,n));
    }
//    static int solve(ArrayList<Integer>arr,int n,int m){
//        ArrayList<Integer>tempArrr=new ArrayList<>();
//        for(int i=1;i<m;i++){
//            tempArrr.add(Math.abs(arr.get(0)-arr.get(i)));
//        }
//        return tempArrr.get(n-1);
//    }
    static int  solve(int[] arr, int n){
        Arrays.sort(arr);
        return IntStream.range(0,arr.length-n+1).map(i -> arr[n+i-1]-arr[i]).min().getAsInt();
    }
}
