package Codeforces.Sep14;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubsequencePermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            String s=sc.next();
            System.out.println(solve(s));
        }
    }
    static  int solve(String s){
        String sorted= s.chars().sorted().mapToObj(ch-> String.valueOf((char)ch)).collect(Collectors.joining());
        return (int) IntStream.range(0,s.length()).filter(i-> s.charAt(i)!=sorted.charAt(i)).count();
    }
}
