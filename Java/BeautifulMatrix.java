package Codeforces;

import java.util.Scanner;

public class BeautifulMatrix {
    public static final int size=5;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [][] matrix= new int[size][size];
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println(solve(matrix));
    }
    static int solve(int[][]matrix){
        for(int r=0;;r++){
            for(int c=0;c<size;c++){
                if(matrix[r][c]==1){
                    return Math.abs(r-2)+Math.abs(c-2);
                }
            }
        }
    }
}
