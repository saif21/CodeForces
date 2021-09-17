package Codeforces.Sep17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CaptainFlintAndCrewRecruitment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 0; tc < t; ++tc) {
            int n = sc.nextInt();

            System.out.println(solve(n));
        }

    }
    static String solve(int n) {
        if (n <= 30) {
            return "NO";
        } else if (n == 36 || n == 40 || n == 44) {
            return String.format("YES\n6 10 15 %d", n - 31);
        } else {
            return String.format("YES\n6 10 14 %d", n - 30);
        }
    }
}
//    static List<Integer> primeNumbers(int n){
//        List<Integer>list=new ArrayList<>();
//        for(int i=1;i<=n;i++){
//            int counter=0;
//            for(int num=i;num>=1;num--){
//                if(i%num==0){
//                    counter+=1;
//                }
//            }
//            if(counter==2){
//                list.add(i);
//            }
//        }
//        return list;
//    }

