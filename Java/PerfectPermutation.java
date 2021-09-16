package Codeforces.Sep16;

import java.util.Scanner;

public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(solve(n));
    }
    static String solve(int n){
        StringBuilder s=new StringBuilder();
        if(n%2==1){
            s.append(-1);
        }else{
            for(int i=1;i<=n;i++){
                if(i%2!=0){
                    s.append(i+1+" ");
                }else {
                    s.append(i-1+" ");
                }
            }
        }
        return String.format("%s",s);
    }
}
