package Codeforces.Sep19;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Countdown {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            String s=sc.next();
            System.out.println(solve(s));
        }
    }
    static int solve(String s){
        int zeros=(int) IntStream.range(0,s.length()).filter(i-> s.charAt(i)=='0').count();
        int sum=IntStream.range(0,s.length()).map(i->s.charAt(i)-'0').sum();
        int ans=sum+s.length()-zeros;
        if(s.charAt(s.length()-1)=='0'){
            return ans;
        }else {
            return ans-1;
        }
    }
}
//    int zeros=(int) IntStream.range(0,s.length()).filter(i-> s.charAt(i)=='0').count();
//    int digits=s.length()-zeros;
//
//        if(zeros==s.length()){
//                return 0;
//                }
//                if(s.charAt(0)!='0' && zeros==0){
//                return IntStream.range(0,s.length()).map(i-> s.charAt(i)-'0').sum()+digits-1;
//                }else if(s.charAt(0)!='0' && zeros>0){
//                int sum= IntStream.range(0,s.length()).map(i-> s.charAt(i)-'0').sum();
//                if(sum==1){
//                return sum+1;
//                }else {
//                return sum+zeros;
//                }
//                }else if(s.charAt(0)=='0' && digits==1){
//                return  IntStream.range(0,s.length()).map(i-> s.charAt(i)-'0').sum();
//                }
//                else {
//                return  IntStream.range(0,s.length()).map(i-> s.charAt(i)-'0').sum()+digits;
//                }