package Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sang Jun Park on 11/20/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/2503
public class Bruteforcing09 {
    static int N;
    static int guss = 0;
    static List<Integer> list = new ArrayList<>();
    public static void Brutefrocing(int[] number, int strike, int ball, int guss){
        List<Integer> tmpL = new ArrayList<>();
        for(int i = 123; i <= 987; i++){
            int[] tmpN = new int[3];
            int tmpS = 0;
            int tmpB = 0;
            tmpN[0] = i / 100;
            tmpN[1] = (i / 10) % 10;
            tmpN[2] = i % 10;
            if(tmpN[1] == 0 || tmpN[2] == 0 || tmpN[0] == tmpN[1] || tmpN[0] == tmpN[2] || tmpN[1] == tmpN[2]){
                continue;
            }
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    if(tmpN[j] == number[k]){
                        if(j == k){
                            tmpS++;
                            continue;
                        }
                        tmpB++;
                    }
                }
            }
            if(tmpS == strike && tmpB == ball)
                tmpL.add(i);
        }
        if(guss != 1)
            list.retainAll(tmpL);
        else
            list.addAll(tmpL);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            int[] number = new int[3];
            int strike;
            int ball;
            String[] line = br.readLine().split(" ");
            number[0] = Integer.parseInt(String.valueOf(line[0].charAt(0)));
            number[1] = Integer.parseInt(String.valueOf(line[0].charAt(1)));
            number[2] = Integer.parseInt(String.valueOf(line[0].charAt(2)));
            strike = Integer.parseInt(line[1]);
            ball = Integer.parseInt(line[2]);
            guss++;
            Brutefrocing(number, strike, ball, guss);
        }
        System.out.println(list.size());
    }
}
