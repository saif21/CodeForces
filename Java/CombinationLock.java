package Codeforces.Sep15;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CombinationLock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String original=sc.next();
        String combination=sc.next();
        System.out.println(solve(original,combination));
    }
    static int solve(String original, String combination){
        return IntStream.range(0,original.length()).map(i->compute(original.charAt(i)-'0',combination.charAt(i)-'0')).sum();
    }
    static int compute(int x,int y){
        return Math.min(Math.abs(x-y),10-Math.abs(x-y));
    }
}
