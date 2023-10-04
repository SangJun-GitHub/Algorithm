package Basic01.Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 09/25/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/1149
public class Main1149 {
    static long[][] dp;
    static long[][] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new long[N + 1][3];
        A = new long[N + 1][3];

        StringTokenizer st;
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            A[i][0] = Long.parseLong(st.nextToken());
            A[i][1] = Long.parseLong(st.nextToken());
            A[i][2] = Long.parseLong(st.nextToken());
        }

        System.out.println(bottomUp(N));
    }
    public static long bottomUp(int n){
        for(int i = 1; i <= n; i++){
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + A[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + A[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + A[i][2];
        }
        return Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2]));
    }
}
