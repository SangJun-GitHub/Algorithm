package Ch02.Stack;

import java.io.*;
import java.util.Stack;

/**
 * Created by Sang Jun Park on 9/1/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/9093
public class Main9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            Stack<Character> stack = new Stack<>();
            String str = br.readLine() + '\n';
            for(char ch : str.toCharArray()){
                if(ch == ' ' || ch =='\n'){
                    while(!stack.empty()){
                        bw.write(stack.pop());
                    }
                    bw.write(ch);
                } else {
                    stack.push(ch);
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
