package Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 09/23/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/15988
public class Main15988 {
    static long[] dp;
    final static int MAX = 1_000_000;
    final static long MOD = 1_000_000_009;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        dp = new long[MAX + 1];
        dp[0] = dp[1] = 1;
        dp[2] = 2;

        while(T-- > 0){
            int n = Integer.parseInt(br.readLine());
            System.out.println(topDown(n));
            System.out.println(bottomUp(n));
        }

    }
    public static long topDown(int n){
        if(dp[n] > 0)
            return dp[n];

        dp[n] = (topDown(n - 1) + topDown(n - 2 ) + topDown(n - 3)) % MOD;

        return dp[n];
    }
    public static long bottomUp(int n){
        if(n < 3)
            return dp[n];

        for(int i = 3; i <= n; i++){
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % MOD;
        }

        return dp[n];
    }

}

