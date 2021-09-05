package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int input=sc.nextInt();
        int [][]arr=new int[input][3];
        for(int i=0;i<input;i++){
            for(int j=0;j<3;j++){
                int x=sc.nextInt();
                arr[i][j]=x;
                sum+=x;
            }
        }
        System.out.println(sum==0?"YES":"NO");

    }
}
class YPhysicist{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []x=new int[n];
        int[]y=new int[n];
        int[]z=new int[n];
        for(int i=0;i<n;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            z[i] = sc.nextInt();
        }
        System.out.println(solve(x,y,z)?"YES":"NO");
    }
    static boolean solve(int []x,int []y,int []z){
        return Arrays.stream(x).sum() == 0 && Arrays.stream(y).sum() == 0 && Arrays.stream(z).sum()==0;
    }
}
