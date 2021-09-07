package Codeforces.SevenSep;

import javax.xml.stream.events.Characters;
import java.util.Arrays;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.nextInt();
        String s = sc.next();
        System.out.println(solve(s) ? "YES" : "NO");

        sc.close();
    }

    static boolean solve(String s) {
        return s.toLowerCase().chars().distinct().count() == 26;
    }
}
