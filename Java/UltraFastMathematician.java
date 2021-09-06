package Codeforces.SixSep;

import java.util.Scanner;
import java.util.stream.IntStream;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n1=sc.next();
        String n2=sc.next();
        System.out.println(solve(n1,n2));
        for(int i=0;i<solve1(n1,n2).length;i++){
            System.out.print(solve1(n1,n2)[i]);
        }
    }
    static String solve(String s1,String s2){
        return IntStream.range(0,s1.length()).map(i -> s1.charAt(i)!=s2.charAt(i)?1:0).
                collect(StringBuilder::new, StringBuilder::append,StringBuilder::append).toString();
    }
    static char [] solve1(String s,String s1){
        char []arr=new char[s.length()];
        for(int k=0;k<s.length();k++){
            if(s.charAt(k)==s1.charAt(k)){
                arr[k]='0';
            }else{
                arr[k]='1';
            }
        }
        return arr;
    }
}
