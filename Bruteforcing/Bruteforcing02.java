package Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 11/17/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/2798
public class Bruteforcing02 {
    static int[] N;
    static int M;
    public static int bruteforcing(int[] N, int m){
        int max = 0;
        int sum = 0;
        for(int i = 0; i < N.length - 2; i++){
            for(int j = i + 1; j < N.length - 1; j++){
                for(int k = j + 1; k< N.length; k++){
                    sum +=N[i];
                    sum +=N[j];
                    sum +=N[k];
                    if(sum <= m && sum > max)
                        max = sum;
                    sum = 0;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        N = new int[Integer.parseInt(line[0])];
        M = Integer.parseInt(line[1]);
        line = br.readLine().split(" ");
        for(int i = 0; i < N.length; i++){
            N[i] = Integer.parseInt(line[i]);
        }
        System.out.println(bruteforcing(N, M));
    }
}
