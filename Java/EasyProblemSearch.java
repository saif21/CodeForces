package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class EasyProblemSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        int [] bits=new int[input];
        for(int i=0;i< bits.length;i++){
            int b=sc.nextInt();
            bits[i]=b;
        }
        System.out.println(solve(bits));
    }
    static String solve(int[]bits){
        String res="";
        int sum=0;
        for(int i=0;i<bits.length;i++){
            sum+=bits[i];
        }
        if(sum>=1){
            res="HARD";
        }else {
            res="EASY";
        }
        return res;
    }
}
