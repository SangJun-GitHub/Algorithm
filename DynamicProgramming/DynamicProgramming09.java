package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 2020-12-02.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/1699
public class DynamicProgramming09 {
    static int N;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];
        dp[1] = 1;
        for(int i = 2; i <= N; i++){
            dp[i] = i;
            for(int j = 1; j * j <= i; j++){
                dp[i] = Math.min(dp[i-(j*j)] + 1, dp[i]);
            }
        }

    }
}
