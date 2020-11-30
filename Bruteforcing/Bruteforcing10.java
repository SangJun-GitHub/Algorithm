package Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 11/21/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/1018
public class Bruteforcing10 {
    static int N;
    static int M;
    static boolean [][] board;
    static int min = 64;
    public static int Bruteforcing(int x, int y){
        int result_w = 0;
        int result_b = 0;
        boolean color_w = true;
        boolean color_b = false;
        for(int i = x; i < x + 8; i++){
            for(int j = y; j < y + 8; j++){
                if(board[i][j] != color_w) {
                    result_w++;
                }
                color_w = (!color_w);
                if(board[i][j] != color_b){
                    result_b++;
                }
                color_b = (!color_b);
            }
            color_w = (!color_w);
            color_b = (!color_b);
        }
        return Math.min(result_w, result_b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        N = Integer.parseInt(line[0]);
        M = Integer.parseInt(line[1]);
        board = new boolean[N][M];
        for(int i = 0; i < N; i++){
            line = br.readLine().split("");
            for(int j = 0; j < M; j++){
                if(line[j].equals("W"))
                    board[i][j] = true;
                else
                    board[i][j] = false;
            }
        }
        for(int i = 0; i < N - 7; i++){
            for(int j = 0; j < M - 7; j++){
                min = Math.min(min, Bruteforcing(i, j));
            }
        }
        System.out.println(min);
    }
}
