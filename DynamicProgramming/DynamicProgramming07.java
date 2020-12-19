package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 2020-11-28.
 * Github : http://github.com/SangJun-GitHub
 */
public class DynamicProgramming07 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            int[][] value = new int[2][N+1];
            int[][] cost = new int[2][N+1];
            for(int j = 0; j < 2; j++){
                String[] line = br.readLine().split(" ");
                for(int k = 1; k <= N; k++){
                    value[j][k] = Integer.parseInt(line[k - 1]);
                }
            }

            cost[0][1] = value[0][1];
            cost[1][1] = value[1][1];

            for(int j = 2; j <= N; j++){
                cost[0][j] = Math.max(cost[1][j - 1], cost[1][j - 2]) + value[0][j];
                cost[1][j] = Math.max(cost[0][j - 1], cost[0][j - 2]) + value[1][j];
            }

            System.out.println(Math.max(cost[0][N],cost[1][N]));
        }
    }
}
