package Codeforces.Sep15;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ReplacingElements {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int []arr=new int[a];
            for(int j=0;j<a;j++){
                arr[j]=sc.nextInt();
            }
            System.out.println(solve(arr,b)?"YES":"NO");
        }
    }
    static boolean solve(int []arr, int b){
        int  x=(int) Arrays.stream(arr).filter(i-> i<=b).count();
        if(x==arr.length){
            return true;
        }else{
            Arrays.sort(arr);
            int l=(int) IntStream.range(0,arr.length-1).filter(i-> arr[i]+arr[i+1]<=b).count();
            if(l<1){
                return false;
            }else {
                return true;
            }
        }
    }
}
