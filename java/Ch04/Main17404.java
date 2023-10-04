package Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 10/04/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/17404
public class Main17404 {
    static int[][] dp = new int[1001][3];
    static int[][] cost = new int[1001][3];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            cost[i][0] = Integer.parseInt(st.nextToken());
            cost[i][1] = Integer.parseInt(st.nextToken());
            cost[i][2] = Integer.parseInt(st.nextToken());
        }
        System.out.println(bottomUp(N));
    }
    public static int bottomUp(int n){
        int result = 1000 * 1000 + 1;
        for(int i = 0; i <= 2; i++){        //check first house's color
            for(int j = 0; j <= 2; j++){
                if(i == j){
                    dp[1][j] = cost[1][j];
                } else {
                    dp[1][j] = 1000 * 1000 + 1;
                }
            }

            for(int k = 2; k <= n; k++){
                dp[k][0] = Math.min(dp[k - 1][1], dp[k - 1][2]) + cost[k][0];
                dp[k][1] = Math.min(dp[k - 1][0], dp[k - 1][2]) + cost[k][1];
                dp[k][2] = Math.min(dp[k - 1][0], dp[k - 1][1]) + cost[k][2];
            }
            for(int l = 0; l <= 2; l++){    //check last house's color
                if(l == i)                  //if first and last houses' color are same, continue
                    continue;
                result = Math.min(result, dp[n][l]);
            }
        }
        return  result;
    }
}
