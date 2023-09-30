package Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 09/26/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/9465
public class Main9465 {
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            dp = new int[3][n + 1];

            for (int i = 1; i <= 2; i++) {
                st = new StringTokenizer(br.readLine(), " ");

                for (int j = 1; j <= n; j++) {
                    dp[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            System.out.println(downUp(n));
        }
    }

    public static int downUp(int n) {
        if (n == 0)
            return dp[0][0];

        for (int i = 2; i <= n; i++) {
            dp[0][i] += Math.max(Math.max(dp[0][i - 1], dp[1][i - 1]), dp[2][i - 1]);
            dp[1][i] += Math.max(dp[0][i - 1], dp[2][i - 1]);
            dp[2][i] += Math.max(dp[0][i - 1], dp[1][i - 1]);
        }

        int max = -1;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= n; j++) {
                if (dp[i][j] > max)
                    max = dp[i][j];
            }
        }
        return max;
    }

}
