package Codeforces;

import java.util.Scanner;

public class BearAndBigBro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int limark=sc.nextInt();
        int bob=sc.nextInt();
        int count=0;
        while(limark<=bob){
            limark=limark*3;
            bob=bob*2;
            count+=1;
        }
        System.out.println(count);
    }
}
