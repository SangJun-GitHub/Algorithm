package Basic01.Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 09/17/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/11052
public class Main11052 {
    static int[] dp;
    static int[] p;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new int[N + 1];
        p = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 1; i <= N; i++){
            p[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(bottomUp(N));
    }
    public static int bottomUp(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(dp[i] < dp[i - j] + p[j])
                    dp[i] = dp[i - j] + p[j];
            }
        }
        return dp[n];
    }
}
