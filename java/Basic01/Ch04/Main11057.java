package Basic01.Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 09/25/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/11057
public class Main11057 {
    static int[][] dp;
    final static int MOD = 10007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new int[N + 1][10];
        System.out.println(bottomUp(N));
    }
    public static int bottomUp(int n){
        for(int i = 0; i < 10; i++){
            dp[1][i] = 1;
        }
        for(int i = 2; i <= n; i++){
            for(int j = 0; j < 10; j++){
                for(int k = 0; k <= j; k++){
                    dp[i][j] += (dp[i - 1][k]) % MOD;
                }
            }
        }
        int result = 0;
        for(int i = 0; i < 10; i++){
            result += dp[n][i];
        }
        return result % MOD;
    }
}
