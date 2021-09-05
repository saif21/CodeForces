package Codeforces;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int input=scanner.nextInt();
        solve(input);
        scanner.close();
    }
    static void solve(int number){
        if(number<=2){
            System.out.println("NO");
        }
        if(number%2==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

}
