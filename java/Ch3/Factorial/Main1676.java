package Ch3.Factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 09/11/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/1676
public class Main1676 {
    // The number 0 only can make through combining between the number 2 and the number 5.
    // Usually, the number 5 is more exist than the number 2.
    // Therefore, we only count the number of 5's in N!.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = 0;
        int square = 1;

        for(int i = 5; i <= N; i = i * 5){
            square *= i;
        }

        for(int i = 5; i <= square; i = i * 5){
            result += N/i;
        }
        System.out.println(result);
    }
}
