package Ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 9/5/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/17298
public class Main17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] NGE = new int[N];

        Stack<Integer> stack = new Stack<>();

        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        stack.push(0);
        for(int i = 1; i < N; i++){
              while(!stack.empty() && A[stack.peek()] < A[i]){
                NGE[stack.pop()] = A[i];
            }
            stack.push(i);
        }

        while(!stack.empty()){
            NGE[stack.pop()] = -1;
        }

        for (int j : NGE) {
            sb.append(j).append(" ");
        }

        System.out.println(sb.substring(0, sb.length() - 1));
    }
}
