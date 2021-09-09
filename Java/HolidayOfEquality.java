package SepNine;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(solve(a));

        sc.close();
    }

    static int solve(int[] a) {
        int max = Arrays.stream(a).max().getAsInt();
        return Arrays.stream(a).map(x -> max - x).sum();
    }
}
