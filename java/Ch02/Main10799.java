package Ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Created by Sang Jun Park on 9/5/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
public class Main10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        boolean open = false;
        char[] ch = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : ch) {
            if (c == '(') {
                open = true;
                stack.add(c);
            } else {
                if(!stack.empty()) {
                    stack.pop();
                    if (open) {
                        result += stack.size();
                        open = false;
                    } else {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
        br.close();
    }
}
