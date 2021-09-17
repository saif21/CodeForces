package Codeforces.Sep17;

import java.util.Arrays;
import java.util.Scanner;

public class FreeIceCream {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Record []arr=new Record[n];
        for(int i=0;i<n;i++){
            char x=sc.next().charAt(0);
            int amount=sc.nextInt();
            arr[i]=new Record(x,amount);
        }

        System.out.println(solve(arr,m));
    }
    static String solve(Record[] records, int x) {
        long balance = x;
        int distressNum = 0;
        for (Record record : records) {
            if (record.sign == '+' || balance >= record.amount) {
                if (record.sign == '+') {
                    balance += record.amount;
                } else {
                    balance -= record.amount;
                }
            } else {
                distressNum++;
            }
        }
        return String.format("%d %d", balance, distressNum);
    }

}

class Record{
    char sign;
    int amount;
    Record(char sign, int amount){
        this.sign=sign;
        this.amount=amount;
    }
}
