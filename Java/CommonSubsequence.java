package Codeforces.Sep18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonSubsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            int l=sc.nextInt();
            int []arr=new int[k];
            int []arr2=new int[l];
            for(int j=0;j<k;j++){
                arr[j]=sc.nextInt();
            }
            for(int m=0;m<l;m++){
                arr2[m]=sc.nextInt();
            }
            System.out.println(solve(arr,arr2));
        }
    }
    static String solve(int []arr1,int []arr2){
        Set<Integer> s=Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        for(int i:arr2){
            if (s.contains(i)){
                return String.format("YES\n1 %d",i);
            }
        }
        return "NO";
    }
}
