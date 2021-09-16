package Codeforces.Sep16;

import java.util.Scanner;

public class PrettyPermutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            System.out.println(solve(a));
        }
    }
    static String solve(int a){
        StringBuilder s=new StringBuilder();
        if(a==1){
            return "1";
        }
        if(a%2==1){
            for(int i=1;i<=a-3;i+=2){
                s.append(i+1+" "+i+" ");
            }
            s.append(String.format("%d %d %d ",a,a-2,a-1));
        }else{
            for(int i=1;i<=a;i+=2){
                s.append(i+1+" "+i+" ");
            }
        }
        return String.format("%s",s);
    }
}
