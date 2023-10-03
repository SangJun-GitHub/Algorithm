package Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 09/25/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/1309
public class Main1309 {
    static int[][] dp;
    final static int MOD = 9901;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new int[N + 1][3];
        System.out.println(bottomUp(N));
    }
    public static int bottomUp(int n){
        if(n == 0)
            return 0;
        dp[1][0] = dp[1][1] = dp[1][2] = 1;
        for(int i = 2; i <= n; i++){
            dp[i][0] = (dp[i - 1][0] + dp[i - 1][1]+ dp[i - 1][2]) % MOD;
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % MOD;
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
        }
        return (dp[n][0] + dp[n][1] + dp[n][2]) % MOD;
    }
}
