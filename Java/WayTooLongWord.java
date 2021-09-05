package Codeforces;

import java.util.Scanner;

public class WayTooLongWord {
    public static void main(String[] args) {
        int i=0;
        Scanner scanner=new Scanner(System.in);
        int number = scanner.nextInt();
        if(number>=1&&number<=100){
            while(i<=number){
                String input=scanner.nextLine();
                System.out.println(convert(input));
                i++;
            }
        }
    }
    static String convert(String str){
        int n=str.length();
        if(str.length()>10){
            return str.charAt(0)+ Integer.toString(n-2) +  str.charAt(n-1);
        }
        return str;
    }
}
