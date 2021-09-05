package Codeforces;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Magenet {
    public static void main(String[] args) {
        int count=1;
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        String [] magnets=new String[input];
        for(int i=0;i<input;i++){
            magnets[i]=sc.next();
        }
        for(int j=0;j<magnets.length-1;j++){
            if(!magnets[j].equals(magnets[j+1])){
                count+=1;
            }
        }
        System.out.println(solve(magnets));
        System.out.println("**** "+count);
    }
    public static int solve(String [] magnets){
        return (int) IntStream.range(0,magnets.length-1).filter(i ->!magnets[i].equals(magnets[i+1])).count()+1;
    }
}
