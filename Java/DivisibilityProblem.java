package Codeforces.SevenSep;

import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int tc = 0; tc < t; ++tc) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(solve(a, b));
        }

        sc.close();
    }

    static int solve(int a, int b) {
        return (b - a % b) % b;
    }
}
