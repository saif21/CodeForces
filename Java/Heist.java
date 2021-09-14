package Codeforces.Sep14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Heist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(solve(list));
    }
    static int solve(List<Integer>arr){
        int res=0;
        Collections.sort(arr);
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i+1)-arr.get(i)!=1){
                res+=(arr.get(i+1)-arr.get(i)-1);
            }
        }
        return res;
    }
}
