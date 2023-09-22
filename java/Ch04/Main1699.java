package Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 09/20/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//1https://www.acmicpc.net/problem/1699
public class Main1699 {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new int[N + 1];
        System.out.println(bottomUp(N));
    }
    //Dp[N] = min(Dp[N - i * i]) + 1
    // 1 * 1 <= i * i <= N
    public static int bottomUp(int n){
        for(int i = 1; i <= n; i++){
            dp[i] = i;
            for(int j = 1; j * j <= i; j++){
                if(dp[i] > dp[i - j * j] + 1)
                    dp[i] = dp[i - j * j] + 1;
            }
        }
        return  dp[n];
    }
}
