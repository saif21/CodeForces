package Codeforces.Sep18;

import java.util.Scanner;

public class ErasingZeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            System.out.println(solve(s));
        }

    }
    static int solve(String s){
        int len=s.length();
        int left=-1;
        int right=-1;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='1'){
                left=i;
                break;
            }
        }
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                right=i;
                break;
            }
        }
        if(left==-1 && right==-1){
            return 0;
        }
        int ans=0;
        for(int i=left;i<right;i++){
            if(s.charAt(i)=='0'){
                ans++;
            }
        }
        return ans;
    }
}
