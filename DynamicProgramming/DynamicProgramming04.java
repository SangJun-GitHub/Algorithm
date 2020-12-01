package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 11/26/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/1904
public class DynamicProgramming04 {
    static int N;
    static int[] binary;
    public static int DynamicProgramming(int n){
        if(n == 1)
            return 1;
        else if(n == 2)
            return 2;

        if(binary[n] != 0)
            return  binary[n];
        else
            return binary[n] = (DynamicProgramming(n-1) + DynamicProgramming(n - 2)) % 15746;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        binary = new int[N + 1];
        System.out.println(DynamicProgramming(N));
    }
}
