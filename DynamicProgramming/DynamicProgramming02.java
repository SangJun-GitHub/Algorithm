package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 11/25/2020.
 * Github : http://github.com/SangJun-GitHub
 */
public class DynamicProgramming02 {
    static int N;
    static int[] fibo_dp;
    public static int fibo(int n){
        if(n <= 2){
            fibo_dp[n] = 1;
            return fibo_dp[n];
        }
        if(fibo_dp[n] != 0)
            return fibo_dp[n];
        else{
            fibo_dp[n] = fibo(n - 1) + fibo(n - 2);
            return fibo_dp[n];
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        fibo_dp = new int[N+1];
        System.out.println(fibo(N));
    }
}
