package Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 09/30/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/1932
public class Main1932 {
    static int[][] dp;
    static int[][] cost;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new int[n][n];
        cost = new int[n][n];

        StringTokenizer st;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j <= i; j++){
                cost[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(downUp(n));

    }
    public static int downUp(int n){
        //dp[i][j] = MAX(dp[i - 1][j], dp[i - 1][j - 1]) + A[i][j]

        dp[0][0] = cost[0][0];

        for(int i = 1; i < n; i++){
            for(int j = 0; j <= i; j++){
                dp[i][j] = dp[i - 1][j] + cost[i][j];
                if(j - 1 >= 0 && dp[i][j] < dp[i - 1][j - 1] + cost[i][j])
                    dp[i][j] = dp[i - 1][j - 1] + cost[i][j];
            }
        }

        int result = dp[n - 1][0];
        for(int i = 0; i < n; i++){
            if(result < dp[n - 1][i])
                result = dp[n - 1][i];
        }

        return result;
    }
}
