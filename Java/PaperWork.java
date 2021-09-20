package Codeforces.Sep20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PaperWork {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solve(arr));
    }
    static String solve(int[]arr){
        List<Integer>list=new ArrayList<>();
        int count_neg=0;
        int current=0;
        for(int i:arr){
            current++;
            if (i<0){
                count_neg++;
            }
            if(count_neg==3){
                list.add(current-1);
                current=1;
                count_neg=1;
            }
        }
        list.add(current);
        return String.format("%d\n%s",list.size(),
                IntStream.range(0,list.size())
                        .mapToObj(i->String.valueOf(list.get(i)))
                        .collect(Collectors.joining(" ")));
    }
}

/*
int neg=(int) Arrays.stream(arr).filter(i->i<0).count();
        if(arr.length==1){
            return "1\n1";
        }
        if(neg==0){
            return String.format("1\n%d",arr.length);
        }
        StringBuilder s=new StringBuilder();
        int noOfBox=neg/2; int rem=neg%2;
        if(noOfBox==1 && rem==0){
            return String.format("%d\n%d",noOfBox,arr.length);
        }else {
            if(rem==0 && noOfBox>1){
                s.append(noOfBox+"\n");
                s.append(arr.length-(noOfBox-1)*3+" ");
                for(int i=1;i<noOfBox;i++){
                    s.append(1*3+" ");
                }

            }else if((noOfBox>1 || noOfBox==0 )&& rem==1){
                s.append(noOfBox+rem+"\n");
                s.append(arr.length-(noOfBox+rem-1)*3+" ");
                for(int i=1;i<noOfBox;i++){
                    s.append(1*3+" ");
                }
            }
        }
        return s.toString();
 */