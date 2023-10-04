package Basic01.Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 09/17/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/10844
public class Main10844 {
    final static long MOD = 1_000_000_000L;
    static long[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new long[N + 1][10];
        System.out.println(bottomUp(N));
    }
    public static long bottomUp(int n){
        for(int i = 1; i <= 9; i++)
            dp[1][i] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 0; j <= 9; j++){
                dp[i][j] = 0;
                if(j - 1 >= 0)
                    dp[i][j] += dp[i - 1][j - 1];
                if(j + 1 <= 9)
                    dp[i][j] += dp[i - 1][j + 1];

                dp[i][j] %= MOD;
            }
        }
        long result = 0;
        for(int i = 0; i <= 9; i++){
            result += dp[n][i];
        }
        return result % MOD;
    }
}
