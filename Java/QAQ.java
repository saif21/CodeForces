package Codeforces.Sep17;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class QAQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toUpperCase();
        System.out.println(solve(s));
    }
    static int solve(String s){
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'Q') {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == 'A') {
                        for (int k = j + 1; k < s.length(); k++) {
                            if (s.charAt(k) == 'Q') {
                                result++;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
