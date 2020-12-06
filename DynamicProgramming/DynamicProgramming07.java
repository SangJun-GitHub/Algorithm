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
    public static int DynamicProgramming(){
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        value = new int[2][N];
        cost = new int[2][N];
        String[] line;
        for(int i = 0; i < 2; i++){
            line = br.readLine().split(" ");
            for(int j = 0; j < N; j++){
                value[i][j] = Integer.parseInt(line[j]);
            }
        }
        cost[0][0] = value[0][0];
        cost[1][0] = value[1][0];
        System.out.println();
    }
}
