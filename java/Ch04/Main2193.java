package Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 09/17/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/2193
public class Main2193 {
    static long[][] dp_2D;
    static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp_2D = new long[N + 1][2];
        dp = new long[N + 1];
        System.out.println(bottomUp_2D(N));
        System.out.println(bottomUp(N));
    }
    public static long bottomUp_2D(int n){
        dp_2D[1][0] = 0;
        dp_2D[1][1] = 1;

        for(int i = 2; i <= n; i++){
            for(int j = 0; j <= 1; j++){
                if(j == 0){
                    dp_2D[i][j] = dp_2D[i - 1][0] + dp_2D[i - 1][1];
                }else{
                    dp_2D[i][j] += dp_2D[i - 1][0];
                }
            }
        }

        long result = 0;
        for(int i = 0; i <=1; i++){
            result += dp_2D[n][i];
        }

        return result;
    }
    public static long bottomUp(int n){
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i - 2];
        }
        return dp[n];
    }
}
