package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 2020-11-28.
 * Github : http://github.com/SangJun-GitHub
 */
public class DynamicProgramming07 {
    static int N;
    static int[][] value;
    static int[][] cost;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        value = new int[2][N+1];
        cost = new int[2][N+1];
        String[] line;
        for(int i = 0; i < 2; i++){
            line = br.readLine().split(" ");
            for(int j = 0; j <= N; j++){
                value[i][j] = Integer.parseInt(line[j]);
            }
        }
        cost[0][1] = value[0][1];
        cost[1][1] = value[1][1];

        for(int i = 2; i <= N; i++){
            cost[0][i] = Math.max(cost[1][i - 1], cost[1][i - 2]) + value[0][i];
            cost[1][i] = Math.max(cost[0][i - 1], cost[1][i - 2]) + value[1][i];
        }
        
        System.out.println(Math.max(cost[0][N],cost[1][N]));
    }
}
