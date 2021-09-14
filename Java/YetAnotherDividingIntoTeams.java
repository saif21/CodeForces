package Codeforces.Sep14;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class YetAnotherDividingIntoTeams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            int []arr=new int[m];
            for(int j=0;j<m;j++){
                arr[j]=sc.nextInt();
            }
            System.out.println(solve(arr));
        }
    }
    static int solve(int []a){
        Arrays.sort(a);
        //1249A;
        return IntStream.range(0, a.length - 1).anyMatch(i -> a[i] + 1 == a[i + 1]) ? 2 : 1;
    }
}
