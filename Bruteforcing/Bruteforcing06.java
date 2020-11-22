package Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 11/19/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/14501
public class Bruteforcing06 {
    static int N;
    static int[][] table;
    static int result = 0;
    static int index = 0;
    static int sum = 0;

    public static void bruteforcing(int index, int sum){
       if(index >= N){
           if(sum > result){
               result = sum;
           }
           return;
       }
       if(index+ table[index][0] <= N){
           bruteforcing(index+ table[index][0], sum+ table[index][1]);
       }
       bruteforcing(index + 1, sum);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        table = new int[N][2];

        for(int i = 0; i < N; i++){
            String[] line = br.readLine().split(" ");
            table[i][0] = Integer.parseInt(line[0]);
            table[i][1] = Integer.parseInt(line[1]);
        }
        bruteforcing(index, sum);
        System.out.println(result);
    }
}
