package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Presents {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int []arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println(String.join(" ",Arrays.toString(solve(arr))));
//    }
//    static int[] solve(int[]arr){
//        int []result=new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            result[arr[i]-1]=i+1;
//        }
//        return result;
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []input=new int[n];
        int []output=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
            output[input[i]-1]=i+1;
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<input.length;i++){
            ans.append(output[i]).append(" ");
        }
        ans.deleteCharAt(ans.length()-1);
        System.out.println(ans.toString());
    }

}
