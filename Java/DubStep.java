package Codeforces.SixSep;

import java.util.Arrays;
import java.util.Scanner;

public class DubStep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String nw=s.replaceAll("WUB"," ");

        System.out.println(nw.trim());
    }
}
