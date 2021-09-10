package Sep10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BachgoldProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> soln=solution(n);
        System.out.println(soln.size());
        //using string builder it can be done too , just append the element
        System.out.println(String.join(" ",soln.stream().map(String::valueOf).toArray(String[]::new)));
    }
    static List<Integer> solution(int n){
        List<Integer> result=new ArrayList<>();
        while(n!=0){
            int prime;
            if(n%2==0){
                prime=2;
            }else {
                prime=3;
            }
            result.add(prime);
            n-=prime;
        }
        return result;
    }
//    static ArrayList<Integer> solve(int n){
//        ArrayList<Integer>arr=new ArrayList<>();
//        for(int i=1;i<=n;i++){
//            int counter=0;
//            for(int num=i;num>=1;num--){
//                if(i%num==0){
//                    counter=counter+1;
//                }
//            }
//            if(counter==2){
//                arr.add(i);
//            }
//        }
//        return arr;
//    }
}
