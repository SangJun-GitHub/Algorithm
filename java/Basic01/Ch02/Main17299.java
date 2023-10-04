package Basic01.Ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 9/5/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/17299
public class Main17299 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        int[] NGF = new int[N];
        int[] result = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
            NGF[A[i]]++;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i = 1; i < N; i++){
            while(!stack.empty() && NGF[A[stack.peek()]] < NGF[A[i]]){
                result[stack.peek()] = A[i];
                stack.pop();
            }
            stack.push(i);
        }
        while(!stack.empty()){
            result[stack.peek()] = -1;
            stack.pop();
        }

        StringBuilder sb = new StringBuilder();
        for (int j : result) {
            sb.append(j).append(" ");
        }

        System.out.println(sb.substring(0, sb.length() - 1));
    }
}
