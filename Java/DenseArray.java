package Codeforces.Sep15;

import java.util.Scanner;
import java.util.stream.IntStream;

public class DenseArray {
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
    static int solve(int []arr){
        return IntStream.range(0, arr.length-1).map(i-> compute(arr[i],arr[i+1])).sum();
    }
    static int compute(int x,int y){
        if(x>y){
            return compute(y,x);
        }
        if(x*2>=y){
            return 0;
        }
        return 1+compute(x*2,y);
    }
}
