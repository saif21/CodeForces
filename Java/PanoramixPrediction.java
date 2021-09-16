package Codeforces.Sep15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PanoramixPrediction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(solve(a,b)?"YES":"NO");

    }
    static boolean solve(int a, int b){
        if(a>=b){
            return false;
        }else {
            List<Integer> primes=primeNumbers(b);
            int idx=primes.indexOf(a);
            int idx2=primes.indexOf(b);
            if(idx2-idx==1){
                return true;
            }else {
                return false;
            }
        }
    }

    static List<Integer> primeNumbers(int n){
        List<Integer>primes=new ArrayList<>();
        for(int i=1;i<=n;i++){
            int counter=0;
            for(int num=i;num>=1;num--){
                if(i%num==0){
                    counter+=1;
                }
            }
            if(counter==2){
                primes.add(i);
            }
        }
        return primes;
    }
}
