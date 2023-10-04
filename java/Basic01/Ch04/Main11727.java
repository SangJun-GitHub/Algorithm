package Basic01.Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 09/16/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/11727
public class Main11727 {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new int[n + 1];
        System.out.println(topDown(n));
        System.out.println(bottomUp(n));
    }
    public static int topDown(int n){
        if(n == 0 || n == 1)
            return 1;

        if(dp[n] > 0)
            return dp[n];

        dp[n] = topDown( n - 1) + (2 * topDown(n - 2));
        dp[n] %= 10007;

        return dp[n];
    }
    public static int bottomUp(int n){
        if(n == 0)
            dp[0] = 1;
        if(n == 1)
            dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + (2 * dp[i - 2]);
            dp[i] %= 10007;
        }
        return dp[n];
    }
}
