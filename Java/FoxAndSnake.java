package Codeforces.EightSep;

import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int m=sc.nextInt();
        StringBuilder str=new StringBuilder();
        String hashh="#";
        for(int i=1;i<n+1;i++){
            if(i%2==1){
                str.append(hashh.repeat(m));
            }else{
                int q=i/2;
                if(q%2==1){
                    str.append(".".repeat(m-1)+hashh);
                }else{
                    str.append(hashh+".".repeat(m-1));
                }
            }
            str.append("\n");
        }
        System.out.println(str);
    }
}
