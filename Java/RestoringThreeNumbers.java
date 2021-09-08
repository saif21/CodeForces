package Codeforces.EightSep;

import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        for(int x:solve(arr)){
            System.out.print(x+" ");
        }
    }
    static int[] solve(int []arr){
        int []sol=new int[3];
        Arrays.sort(arr);
        int max=arr[3];
        for(int i=0;i<3;i++){
            sol[i]=max-arr[i];
        }
        return sol;
    }
}
