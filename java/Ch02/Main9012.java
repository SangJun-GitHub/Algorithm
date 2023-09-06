package Ch02;

import java.io.*;
import java.util.Stack;

/**
 * Created by Sang Jun Park on 9/2/2023.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/9012
public class Main9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            boolean pass = true;
            Stack<Character> stack = new Stack<>();
            String line = br.readLine();
            for(int i = 0; i < line.length(); i++){
                if(line.charAt(i) == '(') {
                    stack.push(line.charAt(i));
                }else if(line.charAt(i) == ')'){
                    if(!stack.empty()) {
                        stack.pop();
                    }else{
                        pass = false;
                        break;
                    }
                }
            }

            if(!stack.empty()|| !pass){
                bw.append("NO").append('\n');
            }else if (stack.empty()){
                bw.append("YES").append('\n');
            }
        }

        bw.flush();
        bw.close();
    }
}
