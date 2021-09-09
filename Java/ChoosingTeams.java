package SepNine;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ChoosingTeams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();int m= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int team=(solve(arr,m))/3;
        System.out.println(team);
    }
    static int solve(int []arr,int m){
        return  (int) IntStream.range(0,arr.length).filter(i -> arr[i]<=5-m).count();
    }
}
