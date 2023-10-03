package Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 10/02/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/11722
public class Main11722 {
    static int[] dp;
    static int[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new int[N];
        A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(bottomUp(N));
    }
    public static int bottomUp(int n){
        int max = 1;

        for(int i = 0; i < n; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(A[j] > A[i] && dp[i] < dp[j] + 1){
                    dp[i] = dp[j] + 1;
                    if(dp[i] > max)
                        max = dp[i];
                }
            }
        }

        return max;
    }
}
