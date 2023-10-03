package Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 09/30/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/2156
public class Main2156 {
    static int[] wine;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        wine = new int[n];
        dp = new int[n];

        for(int i = 0; i < n; i++){
            wine[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(bottomUp(n));
    }
    public static int bottomUp(int n){
        dp[0] = wine[0];

        if (n >= 2) {
            dp[1] = wine[0] + wine[1];
        }
        if(n >= 3) {
            dp[2] = Math.max(dp[1], Math.max(wine[0] + wine[2], wine[1] + wine[2]));

            for (int i = 3; i < n; i++) {
                dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + wine[i], dp[i - 3] + wine[i - 1] + wine[i]));
            }
        }
        return dp[n - 1];
    }
}
