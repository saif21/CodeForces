package Codeforces;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double n=scanner.nextInt();
        double m=scanner.nextInt();
        double a=scanner.nextInt();
        System.out.println(Math.ceil(3.5));
        System.out.println((int)square(n,m,a));
    }
    static double square(double n, double m, double a){
        return (long)(Math.ceil(n/a) * Math.ceil(m/a));
    }
}
