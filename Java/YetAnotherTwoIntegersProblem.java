package Codeforces.EightSep;

import java.util.Scanner;

public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            arr[i]=solve(a,b);
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    static int solve(int a,int b){
        int min=Math.min(a,b);
        int max=Math.max(a,b);
        int count=0;
        if(max-min==0){
            count=0;
        }else {
            if(max-min>=10){
                if((max-min)%10==0){
                    count=(max-min)/10;
                }else {
                    int q=(max-min)/10;
                    count=q+1;
                }

            }else if(max-min<10){
                count=1;
            }
        }
        return count;
    }
}
