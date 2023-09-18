package Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 09/17/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/9095
public class Main9095 {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        dp = new int[12];
        dp[0] = dp[1] = 1;
        dp[2] = 2;
        while(T-- > 0){
            int n = Integer.parseInt(br.readLine());
            System.out.println(topDown(n));
            System.out.println(bottomUp(n));
        }
    }
    public static int topDown(int n){
        if(dp[n] > 0)
            return dp[n];

        dp[n] = topDown(n - 1) + topDown(n- 2 ) + topDown(n - 3);

        return dp[n];
    }
    public static int bottomUp(int n){
        if(n < 3)
            return dp[n];
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }
}
