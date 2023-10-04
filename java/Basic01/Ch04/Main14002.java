package Basic01.Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 09/20/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/14002
public class Main14002 {
    static int[] A;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        A = new int[N + 1];
        dp = new int[N + 1];
        dp[0] = A[0] = -1;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 1; i < N + 1; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        bottomUp(N);
    }
    public static void bottomUp(int n){
        int max = 1;

        for(int i = 1; i < n + 1; i++){
            dp[i] = 1;
            for(int j = 1; j < i; j++){
                if(A[i] > A[j]){
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                    max = Math.max(dp[i], max);
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append(max).append("\n");

        Stack<Integer> stack = new Stack<>();

        for(int i = n; i >= 1; i--){
            if(max == dp[i]){
                stack.push(A[i]);
                max--;
            }
        }

        while(!stack.empty()){
            sb.append(stack.pop()).append(" ");
        }

        System.out.println(sb);
    }
}
