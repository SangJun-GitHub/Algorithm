package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 2020-11-27.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/11727
public class DynamicProgramming06 {
    static int N;
    static int[] tiles;
    public static int DynamicProgramming(int n){
        if(n == 0 || n == 1)
            return 1;

        if(tiles[n] != 0)
            return tiles[n];
        else
            return tiles[n] = (2 * DynamicProgramming(n - 2) + DynamicProgramming(n - 1)) % 10007;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        tiles = new int[N + 1];
        System.out.println(DynamicProgramming(N));
    }
}
