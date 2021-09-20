package Codeforces.Sep20;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreeProblems {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(solve(list));
    }
    static String solve(List<Integer>list){
        int []temp= IntStream.range(0,list.size()).map(i->list.get(i)).toArray();
        Arrays.sort(temp);
        Set<Integer>newSet=new HashSet<>();
        newSet.addAll(list);
        newSet.stream().sorted();
        String s="";
        if(newSet.size()>=3){
            for (Integer i : newSet) {
                int x = list.indexOf(i);
                s += x + 1 + " ";
            }
            return s.substring(0,6);
        }else{
            return "-1 -1 -1";
        }
    }
}
