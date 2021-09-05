package Codeforces;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class GeorgeAccomodation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []filled=new int[n];
        int []capacity=new int[n];
        for(int i=0;i<n;i++){
            filled[i]=sc.nextInt();
            capacity[i]=sc.nextInt();
        }
        System.out.println(solve(filled,capacity));
    }
    static int solve(int[]a,int[]b){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(b[i]-a[i]>=2){
                count+=1;
            }
        }
        return count;
    }
    static int solve1(int[] p, int[] q) {
        return (int) IntStream.range(0, p.length).filter(i -> q[i] - p[i] >= 2).count();
    }
}
