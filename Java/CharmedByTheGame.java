package Codeforces.Sep19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CharmedByTheGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(solve(a,b));
        }
    }
    static String solve(int a, int b){
        List<Integer>list=new ArrayList<>();
        int l=Math.abs(a-b)/2;
        int r=a+b-l;
        int j=1;
        if((a+b)%2==0){
            j=2;
        }
        for(int i=l;i<r+1;i+=j){
            list.add(i);
        }
        return String.format("%d\n%s",list.size(), Arrays.stream(list.toArray())
                .map(i->String.valueOf(i))
                .collect(Collectors.joining(" ")));
    }
}

/*Alice and Borys are playing tennis. (1558);

A tennis match consists of games. In each game, one of the players is serving and the other one is receiving.

Players serve in turns: after a game where Alice is serving follows a game where Borys is serving, and vice versa.

Each game ends with a victory of one of the players. If a game is won by the serving player, it's said that this player holds serve. If a game is won by the receiving player, it's said that this player breaks serve.

It is known that Alice won a games and Borys won b games during the match. It is unknown who served first and who won which games.

Find all values of k such that exactly k breaks could happen during the match between Alice and Borys in total.

Input
Each test contains multiple test cases. The first line contains the number of test cases t (1≤t≤103). Description of the test cases follows.

Each of the next t lines describes one test case and contains two integers a and b (0≤a,b≤105; a+b>0) — the number of games won by Alice and Borys, respectively.

It is guaranteed that the sum of a+b over all test cases does not exceed 2⋅105.

Output
For each test case print two lines.

In the first line, print a single integer m (1≤m≤a+b+1) — the number of values of k such that exactly k breaks could happen during the match.

In the second line, print m distinct integers k1,k2,…,km (0≤k1<k2<…<km≤a+b) — the sought values of k in increasing order.*/
