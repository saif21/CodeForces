package SepNine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int teams=0;

        ArrayList<Integer> newArrA=new ArrayList<>();
//        System.out.println(Arrays.toString(newArrA.toArray()));
        ArrayList<Integer> newArrB=new ArrayList<>();
        ArrayList<Integer> newArrC=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr.get(i)==1){
                newArrA.add(i+1);
            }else if(arr.get(i)==2){
                newArrB.add(i+1);

            }else if(arr.get(i)==3) {
                newArrC.add(i+1);
            }
        }
        StringBuilder s=new StringBuilder();
        teams=solve(newArrA,newArrB,newArrC);
        if(teams>0){
            for(int i=0;i<teams;i++){
                s.append(newArrA.get(i) +" "+newArrB.get(i)+" "+newArrC.get(i)+"\n");
            }
        }
        System.out.println(teams);
        System.out.println(s);

    }
    static int solve(ArrayList<Integer>a,ArrayList<Integer>b,ArrayList<Integer>c){
        int min=Math.min(a.size(),Math.min(b.size(),c.size()));
        return min;
    }
}
