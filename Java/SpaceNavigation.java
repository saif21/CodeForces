package Codeforces.Sep18;

import java.util.Scanner;

public class SpaceNavigation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            String s=sc.next();
            System.out.println(solve(a,b,s.toUpperCase())?"YES":"NO");
        }
    }
    static boolean solve(int px, int py, String s) {
        return (px == 0
                || (px < 0 && s.chars().filter(ch -> ch == 'L').count() >= -px)
                || (px > 0 && s.chars().filter(ch -> ch == 'R').count() >= px))
                && (py == 0
                || (py < 0 && s.chars().filter(ch -> ch == 'D').count() >= -py)
                || (py > 0 && s.chars().filter(ch -> ch == 'U').count() >= py));
    }
}
