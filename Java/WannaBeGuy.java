package Codeforces.SixSep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WannaBeGuy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int input=sc.nextInt();
//        List<Integer> list=new ArrayList<>(sc.nextInt());
//
//        List<Integer> list1=new ArrayList<>(sc.nextInt());
//        list.addAll(list1);
//        List<Integer> newList=list.stream().distinct().collect(Collectors.toList());
//        String []arr=new String[newList.size()];
//        newList.toArray(arr);
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            sum+=Integer.parseInt(arr[i]);
//        }
//        int n=arr.length;
//        int actualSum=(n*n+1)/2;
//        if(sum<actualSum){
//            System.out.println("Oh, my keyboard!");
//        }else{
//            System.out.println("I become the guy.");
//        }
          int n=sc.nextInt();
          int [] levelsX=readArray(sc);
          int [] levelsY=readArray(sc);
          System.out.println(solve(n,levelsX,levelsY)?"I become the guy.":"Oh, my keyboard!");

    }
    static int[]readArray(Scanner sc){
        int size=sc.nextInt();
        int [] result=new int[size];
        for(int i=0;i<result.length;i++){
            result[i]=sc.nextInt();
        }
        return result;
    }
    static boolean solve(int n, int[]a,int[]b){
        return IntStream.concat(Arrays.stream(a),Arrays.stream(b)).distinct().count()==n;
    }

}
