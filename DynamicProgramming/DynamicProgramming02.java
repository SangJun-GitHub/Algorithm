package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 11/25/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/2748
public class DynamicProgramming02 {
    static int N;
    static long[] fibo;
    public static long DynamicProgramming(int n){
        if(n <= 2){
            fibo[n] = 1;
            return fibo[n];
        }
        if(fibo[n] != 0)
            return fibo[n];
        else{
            fibo[n] = DynamicProgramming(n - 1) + DynamicProgramming(n - 2);
            return fibo[n];
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        fibo = new long[N+1];
        System.out.println(DynamicProgramming(N));
    }
}
