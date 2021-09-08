package Codeforces.EightSep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int tc = 0; tc < t; ++tc) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; ++i) {
                a[i] = sc.nextInt();
            }

            System.out.println(solve(a) ? "YES" : "NO");
        }

        sc.close();
    }

    static boolean solve(int[] a) {
        Arrays.sort(a);

        return IntStream.range(0, a.length - 1).allMatch(i -> a[i + 1] - a[i] <= 1);
    }
}