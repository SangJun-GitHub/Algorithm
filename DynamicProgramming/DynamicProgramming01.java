package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 11/21/2020.
 * Github : http://github.com/SangJun-GitHub
 */
public class DynamicProgramming01 {
    static int N;
    static int[] dp;
    public static int DynamicProgramming(int n){
        if(n == 1)
            return 0;
        if(dp[n] > 0)
            return dp[n];

        dp[n] = DynamicProgramming(n - 1) + 1;
        if(n % 2 == 0){
            int result = DynamicProgramming(n / 2) + 1;
            if(dp[n] > result)
                dp[n] = result;
        }
        if(n % 3 == 0){
            int result = DynamicProgramming(n / 3) + 1;
            if(dp[n] > result)
                dp[n] = result;
        }
        return dp[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new int[N+1];
        System.out.println(DynamicProgramming(N));
    }
}
