package Basic01.Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 10/02/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */

public class Main2133 {
    static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new long[N + 1];

        System.out.println(bottomUp(N));
    }
    public static long bottomUp(int n){
        dp[0] = 1;
        for(int i = 2; i <= n; i+=2){
            dp[i] = dp[i - 2] * 3;
            for(int j = i - 4; j >= 0; j -= 2){
                dp[i] += dp[j] * 2;
            }
        }
        return dp[n];
    }
}
