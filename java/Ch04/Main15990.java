package Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 09/17/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/15990
public class Main15990 {
    final static long MOD = 1_000_000_009L;
    final static int MAX = 100_000;
    static long[][] dp = new long[MAX + 1][4];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        topDown();
        while(T-- > 0){
            int n = Integer.parseInt(br.readLine());

            System.out.println((dp[n][1] + dp[n][2] + dp[n][3]) % MOD);
        }
    }
    public static void topDown(){
        for(int i = 1; i <= MAX; i++){
            if(i - 1 >= 0){
                dp[i][1] = dp[i - 1][2] + dp[i - 1][3];
                if(i == 1)
                    dp[i][1] = 1;
            }

            if(i - 2 >= 0){
                dp[i][2] = dp[i - 2][1] + dp[i - 2][3];
                if(i == 2)
                    dp[i][2] = 1;
            }

            if(i - 3 >= 0){
                dp[i][3] = dp[i - 3][1] + dp[i - 3][2];
                if(i == 3)
                    dp[i][3] = 1;
            }
            dp[i][1] %= MOD;
            dp[i][2] %= MOD;
            dp[i][3] %= MOD;
        }
    }
}
