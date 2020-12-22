package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 2020-12-01.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/2294
public class DynamicProgramming08 {
    static int[] coin;
    static int[] dp;
    static int N;
    static int K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        N = Integer.parseInt(line[0]);
        K = Integer.parseInt(line[1]);
        coin = new int[N];
        for(int i = 0; i < N; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }
        dp = new int[K + 1];
        for(int i = 0; i < K + 1; i++)
            dp[i] = 100001;
        dp[0] = 0;

        for(int i = 0; i < N; i++){
            for(int j = coin[i]; j <= K; j++){
                dp[j] = Math.min(dp[j], dp[j - coin[i]] + 1);
            }
        }
        System.out.println(dp[K] == 100001 ? -1 : dp[K]);
    }
}
