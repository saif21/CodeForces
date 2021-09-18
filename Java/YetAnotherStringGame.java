package Codeforces.Sep18;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class YetAnotherStringGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            System.out.println(solve(s));
        }
    }
    static String solve(String s){
        return IntStream.range(0, s.length())
                .mapToObj(
                        i -> {
                            char ch = s.charAt(i);

                            if (i % 2 == 0) {
                                return (ch == 'a') ? "b" : "a";
                            } else {
                                return (ch == 'z') ? "y" : "z";
                            }
                        })
                .collect(Collectors.joining());
    }
}
