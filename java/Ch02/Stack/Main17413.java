package Ch02.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Created by Sang Jun Park on 9/5/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/17413
public class Main17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] line = br.readLine().toCharArray();

        Stack<Character> stack = new Stack<>();
        boolean reverse = true;
        for (char c : line) {
            if (c == '<') {
                if (!stack.empty()) {
                    while (!stack.empty()) {
                        sb.append(stack.pop());
                    }
                }
                reverse = false;
                sb.append(c);
            } else if (c == '>') {
                reverse = true;
                sb.append(c);
            } else if (reverse && c == ' ') {
                while (!stack.empty()) {
                    sb.append(stack.pop());
                }
                sb.append(" ");
            } else if (reverse) {
                stack.push(c);
            } else {
                sb.append(c);
            }
        }
        if(!stack.empty()){
            while(!stack.empty()){
                sb.append(stack.pop());
            }
        }
        System.out.println(sb);
    }
}
