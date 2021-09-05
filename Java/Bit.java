package Codeforces;

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0; i<=n; i++){
            String s=sc.nextLine();
            sum+=bit(s);
        }
        System.out.println(sum);
    }
    static int bit(String s){
        if(s.contains("+")){
            return 1;
        }else if(s.contains("-")){
            return -1;
        }
        return 0;
    }
}
