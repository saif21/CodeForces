package Sep10;

import java.util.Scanner;

public class MagicalSticks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            arr[i]=solve(m);
        }
        for(int i: arr){
            System.out.println(i);
        }
    }
    static int solve(int n){
        int res=0;
        if(n%2==1 ){
            res=(int)Math.ceil((double) (n)/2);
        }else {
            res=n/2;
        }
        return res;
    }
}
