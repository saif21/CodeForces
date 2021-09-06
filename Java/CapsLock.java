package Codeforces.SixSep;

import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        char []ch=s.toCharArray();
        boolean b=true;
        for(int i=1;i<ch.length;i++){
            if(Character.isLowerCase(ch[i])){
                b=false;
            }
        }
        if(b==true){
            for(int i=0;i<ch.length;i++){
                if(Character.isUpperCase(ch[i])){
                    ch[i]=Character.toLowerCase(ch[i]);
                }else{
                    ch[i]=Character.toUpperCase(ch[i]);
                }
            }
        }
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
}
