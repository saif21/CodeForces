package Codeforces.Sep15;

import java.util.Arrays;
import java.util.Scanner;

public class OddSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            int []arr=new int[m*2];
            for(int j=0;j<m*2;j++){
                arr[j]=sc.nextInt();
            }
            System.out.println(solve(arr)?"Yes":"No");
        }
    }
    static boolean solve(int []arr){
        int oddCount=(int) Arrays.stream(arr).filter(i-> i%2==1).count();
        int evenCount=(int) Arrays.stream(arr).filter(i-> i%2==0).count();
        if(oddCount>evenCount || evenCount>oddCount){
            return false;
        }else{
            return true;
        }
    }
}
