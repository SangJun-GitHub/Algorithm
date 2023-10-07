package Basic02.Ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 10/07/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/1748
public class Main1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        System.out.println(bruteForce(N));
    }
    public static long bruteForce(long n){
        long result = 0L;

        for(int start = 1, length = 1; start <= n; start *= 10, length++){
            long end = start * 10L -1;
            if(end > n){
                end = n;
            }
            result += (end - start + 1) * length;
        }
        return result;
    }
}
