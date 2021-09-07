package Codeforces.SevenSep;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(solve(s));
    }
    static int solve(String s){
        return (int) Arrays.stream(s.substring(1,s.length()-1).split(", ")).filter(i -> !i.isEmpty()).distinct().count();
    }
}
