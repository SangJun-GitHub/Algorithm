package Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 09/17/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/2193
public class Main2193 {
    static long[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new long[N + 1][2];
        System.out.println(bottomUp(N));
    }
    public static long bottomUp(int n){
        dp[1][0] = 0;
        dp[1][1] = 1;

        for(int i = 2; i <= n; i++){
            for(int j = 0; j <= 1; j++){
                if(j == 0){
                    dp[i][j] = dp[i - 1][0] + dp[i - 1][1];
                }else{
                    dp[i][j] += dp[i - 1][0];
                }
            }
        }

        long result = 0;
        for(int i = 0; i <=1; i++){
            result += dp[n][i];
        }

        return result;
    }
}
