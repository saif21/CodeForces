package Codeforces;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int countL=0;int countU=0;
        String[] input1=input.split("");
        for(int i=0;i<input1.length;i++){
            if(input1[i]==input1[i].toLowerCase()){
                countL+=1;
            }else{
                countU+=1;
            }
        }
        if(countL>=countU){
            System.out.println(input.toLowerCase());
        }else {
            System.out.println(input.toUpperCase());
        }
    }
}
