package Codeforces.EightSep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumofRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            System.out.println(solve(a).size());
            for (Integer j : solve(a)) {
                System.out.print(j + " ");
//            System.out.println(solve(a));
            }
        }
    }
    static ArrayList<Integer> solve(int x){
        int count=0;
        ArrayList<Integer> arr=new ArrayList<>();
        int a=x;
        while(a>0){
            if(a>=1000){
                if(a%1000==0){
                    arr.add(a);
                    a=a%1000;
                }else if(a%1000!=0){
                    int rem=a%1000;
                    arr.add(a-rem);
                    a=rem;
                }
            }else if(a>=100){
                if(a%100==0){
                    arr.add(a);
                    a=a%100;
                }else if(a%100!=0){
                    int rem=a%100;
                    arr.add(a-rem);
                    a=a%100;
                    count+=1;
                }
            }else if(a>=10){
                if(a%10==0){
                    arr.add(a);
                    a=a%10;
                }else if(a%10!=0){
                    int rem=a%10;
                    arr.add(a-rem);
                    a=a%10;
                    count+=1;
                }
            }else  {
                arr.add(a);
                count+=1;
                break;
            }

        }
        return arr;
    }

//    static String solve(int n) {
//        List<Integer> terms = new ArrayList<>();
//        for (int i = 10000; i >= 1; i /= 10) {
//            int term = n / i * i;
//            if (term != 0) {
//                terms.add(term);
//                n -= term;
//            }
//        }
//
//        return String.format("%d\n%s", terms.size(),
//                terms.stream().map(String::valueOf).collect(Collectors.joining(" ")));
//    }
}
















