package Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 10/01/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */

public class Main11055 {
    static int[] dp;
    static int[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new int[n];
        A = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(bottomUp(n));
    }
    public static int bottomUp(int n){
        // dp[i] = max(dp[j] + a[i])
        // j < i
        // a[j] < a[i]
        for(int i = 0; i < n; i++){
            dp[i] = A[i];
            for(int j = 0; j < i; j++){
                if(A[j] < A[i] && dp[i] < dp[j] + A[i])
                    dp[i] = dp[j] + A[i];
            }
        }
        int result = -1;
        for(int i = 0; i < n; i++){
            if(result < dp[i])
                result = dp[i];
        }
        return result;
    }
}
