package Codeforces;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        if(n%5==0){
            count+=n/5;
        }else {
            count+=(n/5)+1;
        }
        System.out.println(count);
    }
}
