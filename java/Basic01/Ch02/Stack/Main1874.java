package Basic01.Ch02.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Created by Sang Jun Park on 9/2/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/1874
public class Main1874 {
    static int N;
    static StringBuilder sb = new StringBuilder();
    static int num = 1;
    static boolean pass = true;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();


        for(int i = 0; i < N; i++){
            int data = Integer.parseInt(br.readLine());

            for(; num <= data; num++){
                stack.push(num);
                sb.append("+").append("\n");
            }

            if(stack.peek() == data){
                stack.pop();
                sb.append("-").append("\n");
            } else{
                pass = false;
            }
        }

        if(pass){
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
    }
}
