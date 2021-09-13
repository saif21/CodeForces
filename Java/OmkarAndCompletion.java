package Codeforces.Sep13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OmkarAndCompletion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int m=sc.nextInt();
            System.out.println(Arrays.stream(solve(m)).mapToObj(x->String.valueOf(x)).collect(Collectors.joining(" ")));
        }
    }
    static int[]solve(int m){
        int []res=new int[m];
        for (int i=0;i<m;i++){
            res[i]=1;
        }
        for(int i=2;i<m;i+=2){
            res[i]=res[i-2]+res[i-1]+1;
        }
        return res;
    }
}
