package Basic01.Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 09/20/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/2225
public class Main2225 {
    static long[][] dp;
    final static long MOD = 1_000_000_000;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        dp = new long[K + 1][N + 1];

        System.out.println(bottomUp(N, K));
    }
    //dp[K][N] = Σdp[K - 1][N - L]
    //0 < L <= N
    public static long bottomUp(int n, int k){
        dp[0][0] = 1;
        for(int i = 1; i <= k; i++){
            for(int j = 0; j <= n; j++){
                for(int l = 0; l <= j; l++){
                    dp[i][j] += dp[i - 1][j - l];
                    dp[i][j] %= MOD;
                }
            }
        }
        return dp[k][n];
    }
}
