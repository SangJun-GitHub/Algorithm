package Basic02.Ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Sang Jun Park on 10/04/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/3085
public class Main3085 {
    static String[][] candy;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        candy = new String[N][N];

        for(int i = 0; i < N; i++){
            String[] line = br.readLine().split("");
            for(int j = 0; j < N; j++){
                candy[i][j] = line[j];
            }
        }
        System.out.println(bruteForce(N));
    }
    public static int bruteForce(int n){
        int max = 1;
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < n; j++){
                int horizontal = check(candy);
                if(max < horizontal)
                    max = horizontal;
                if(j + 1 < n){
                    swap(i, j, i, j + 1);
                    horizontal = check(candy);
                    if(max < horizontal)
                        max = horizontal;
                    swap(i, j + 1, i, j);
                }
                int vertical = check(candy);
                if(max < vertical)
                    max = vertical;
                if(i + 1 < n){
                    swap(i, j, i + 1, j);
                    vertical = check(candy);
                    if(max < vertical)
                        max = vertical;
                    swap(i + 1, j, i, j);
                }
            }
        }
        return max;
    }
    public static void swap(int a, int b, int x, int y){
        String tmp = candy[a][b];
        candy[a][b] = candy[x][y];
        candy[x][y] = tmp;
    }
    public static int check(String[][] candy){
        int n = candy.length;
        int max = 1;
        for(int i = 0; i < n; i++){
            int horizontal = 1;
            for(int j = 1; j < n; j++){
                if(candy[i][j].equals(candy[i][j - 1])){
                    horizontal++;
                }else{
                    if(horizontal > max)
                        max = horizontal;
                    horizontal = 1;
                }
            }
            if(horizontal > max)
                max = horizontal;

            int vertical = 1;
            for(int k = 1; k < n; k++){
                if(candy[k][i].equals(candy[k - 1][i])){
                    vertical++;
                }else{
                    if(vertical > max)
                        max = vertical;
                    vertical = 1;
                }
            }
            if(vertical > max)
                max = vertical;
        }
        return max;
    }
}
