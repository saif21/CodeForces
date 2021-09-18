package Codeforces.Sep18;

import java.util.Scanner;

public class PuzzlePieces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(solve(a,b)?"YES":"NO");
        }
    }
    static boolean solve(int a, int b){
        if ((a==1||b==1) || (a==2 && b==2)){
            return true;
        }else {
            return false;
        }
    }
}
