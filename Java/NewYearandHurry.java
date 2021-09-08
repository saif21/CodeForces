package Codeforces.EightSep;

import java.util.Scanner;

public class NewYearandHurry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int m=sc.nextInt();
        int remainingMins=240-m;
        int solved=0;
        for(int i=1;i<n+1;i++){
            int count=i*5;
            if(count<=remainingMins){
                remainingMins-=count;
                solved++;
            }else {
                break;
            }
        }
        System.out.println(solved);
    }
}
