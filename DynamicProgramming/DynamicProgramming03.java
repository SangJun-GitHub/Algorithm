package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 11/25/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/2193
public class DynamicProgramming03 {
    static int N;
    static long[] pinary;

    public static long DynamicProgramming(int n){
        if(n == 1)
            return 1;
        else if(n == 2)
            return 1;

        if(pinary[n] != 0)
            return pinary[n];
        else
            return pinary[n] = DynamicProgramming(n - 1) + DynamicProgramming(n - 2);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        pinary = new long[N + 1];
        System.out.println(DynamicProgramming(N));
    }
}
