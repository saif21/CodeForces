package Codeforces.Sep18;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Cards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        System.out.println(solve(s));
    }
    static String solve(String s){
        return IntStream.concat(IntStream.range(0, (int)s.chars().filter(i->i=='n').count()).map(i->1),
                                IntStream.range(0,(int)s.chars().filter(i->i=='z').count()).map(i->0))
                .mapToObj(String::valueOf).collect(Collectors.joining(" "));
    }
}
