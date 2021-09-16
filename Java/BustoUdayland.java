package Codeforces.Sep15;

import java.util.Arrays;
import java.util.Scanner;

public class BustoUdayland {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String []arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }

        System.out.println(solve(arr));
    }
    static String solve(String[] rows) {
        for (int i = 0; i < rows.length; i++) {
            if (rows[i].contains("OO")) {
                rows[i] = rows[i].replaceFirst("OO", "++");

                return String.format("YES\n%s", String.join("\n", rows));
            }
        }

        return "NO";
    }
}
