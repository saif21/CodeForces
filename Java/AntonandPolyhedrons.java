package Codeforces.SevenSep;

import java.util.Scanner;

public class AntonandPolyhedrons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String []arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        int count=0;
        for(String el:arr){
            switch (el){
                case "Tetrahedron":
                    count+=4;
                    break;
                case "Cube":
                    count+=6;
                    break;
                case "Octahedron":
                    count+=8;
                    break;
                case "Dodecahedron":
                    count+=12;
                    break;
                case "Icosahedron":
                    count+=20;
                    break;
            }
        }
        System.out.println(count);
    }

}
