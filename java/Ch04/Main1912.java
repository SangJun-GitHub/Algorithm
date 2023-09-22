package Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 09/20/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/1912
public class Main1912 {
    static int[] numbers;
    static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        numbers = new int[n];
        dp = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(downUp());
    }
    public static long downUp(){
        dp[0] = numbers[0];
        long max = dp[0];

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] + dp[i - 1] > numbers[i]){
                dp[i] = dp[i - 1] + numbers[i];
            }else{
                dp[i] = numbers[i];
            }

            if(dp[i] > max)
                max = dp[i];
        }

        return max;
    }
}
