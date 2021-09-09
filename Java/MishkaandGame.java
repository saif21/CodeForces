package SepNine;

import java.util.Scanner;

public class MishkaandGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mishka=0;int cris=0;
        for(int i=0;i<n;i++){
            int a= sc.nextInt();
            int b=sc.nextInt();
            if(a>b){
                mishka+=1;
            }else if(b>a) {
                cris+=1;
            }
        }
        if(mishka>cris){
            System.out.println("Mishka");
        }else if(cris>mishka){
            System.out.println("Chris");
        }else {
            System.out.println("Friendship is magic!^^");
        }
    }
}
