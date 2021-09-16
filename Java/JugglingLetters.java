package Codeforces.Sep16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JugglingLetters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            String []s=new String[m];
            for(int j=0;j<m;j++){
                s[j]=sc.next();
            }
            System.out.println(solve(s)?"YES":"NO");
        }
    }
//    static boolean solve(String[] s) {
//        int[] counts = new int[26];
//        for (String si : s) {
//            for (char ch : si.toCharArray()) {
//                ++counts[ch - 'a'];
//            }
//        }
//
//        return Arrays.stream(counts).allMatch(count -> count % s.length == 0);
//    }


    static boolean solve(String[]arr){
        Map<Character,Integer> dict=new HashMap<>();
        for(String i: arr){
            for(char c:i.toCharArray()){
                if(!dict.containsKey(c)){
                    dict.put(c,1);
                }else {
                    int count=dict.get(c)+1;
                    dict.put(c,count);
                }
            }
        }
//        return Arrays.stream(dict.values().toArray()).allMatch(count -> (int) count % arr.length == 0);
        boolean b=false;
        for(int i:dict.values()){
            if(i%arr.length==0){
                b=true;
            }else {
                b=false;
                break;
            }
        }
        return b;
    }
}
