package Sep10;

import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        String s=sc.next();
        System.out.println(solve(arr,s));
    }
    static int solve(int []arr,String s){
        return s.chars().map(ch -> arr[ch-'0'-1]).sum();
    }
    static int anotherSolution(){
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(), calories = 0;
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int a4 = sc.nextInt();
        sc.nextLine();
        String[] values = sc.nextLine().split("");
        for (String i : values) {
            switch (i) {
                case "1":
                    calories += a1;
                    break;
                case "2":
                    calories += a2;
                    break;
                case "3":
                    calories += a3;
                    break;
                case "4":
                    calories += a4;
                    break;
            }
        }
        sc.close();
        return calories;
    }
}
