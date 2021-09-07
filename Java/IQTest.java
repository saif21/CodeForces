package Codeforces.SevenSep;

import java.util.Scanner;
import java.util.stream.IntStream;

public class IQTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(solve(nums));
    }
    static int solve(int[]nums){
        int[] evens= IntStream.range(0,nums.length).filter(i -> i%2==0).toArray();
        int[] odds= IntStream.range(0,nums.length).filter(i -> i%2==0).toArray();
        if(odds.length==1){
            return odds[0]+1;
        }else {
            return evens[0]+1;
        }
    }
}
