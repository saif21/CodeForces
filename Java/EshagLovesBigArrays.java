package Codeforces.Sep16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class EshagLovesBigArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<m;j++){
                list.add(sc.nextInt());
            }
            System.out.println(solve(list));
        }
    }
    static int solve(List<Integer>arr){
        int min=IntStream.range(0,arr.size()).map(i->arr.get(i)).min().getAsInt();
        int count=(int)IntStream.range(0,arr.size()).filter(i->arr.get(i)!=min).count();
        return count;
    }
}
