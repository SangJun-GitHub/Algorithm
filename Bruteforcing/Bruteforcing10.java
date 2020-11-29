package Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 11/21/2020.
 * Github : http://github.com/SangJun-GitHub
 */
public class Bruteforcing10 {
    static int N;
    static int M;
    static boolean [][] board;
    static int min = 64;
    public static int Bruteforcing(){
        int N_max = N - 7;
        int M_max = M - 7;
        for(int i = 0; i < N_max; i ++){
            for(int j = 0; j < M_max; j++){
                boolean color = board[i][j];
                int change = 0;
                for(int x = i+1; x < i + 8; x++){
                    for(int y = j+1; y < j + 8; y++)
                    {
                        if(board[x][y] != color){
                            change++;
                        }
                        color = !color;
                    }
                    color = !color;
                }
                change = Math.min(change, 64 - change);
                min = Math.min(min, change);
            }
        }
        return min;
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
                if(line[j] == "W")
                    board[i][j] = true;
                else
                    board[i][j] = false;
            }
        }
        System.out.println(Bruteforcing());
    }
}
