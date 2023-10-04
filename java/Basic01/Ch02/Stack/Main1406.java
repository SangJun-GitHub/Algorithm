package Basic01.Ch02.Stack;

import java.io.*;
import java.util.Stack;

/**
 * Created by Sang Jun Park on 9/1/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/1406
public class Main1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        String line = br.readLine();
        int M = Integer.parseInt(br.readLine());
        for(char c : line.toCharArray()){
            left.push(c);
        }

        while(M-- > 0){
            String x = br.readLine();
            if(x.charAt(0) == 'L'){
                if(!left.empty()) {
                    right.push(left.pop());
                }
            } else if(x.charAt(0) == 'D'){
                if(!right.empty()) {
                    left.push(right.pop());
                }
            } else if(x.charAt(0) == 'B'){
                if(!left.empty()) {
                    left.pop();
                }
            } else if(x.charAt(0) == 'P'){
                left.push(x.charAt(2));
            }
        }
        while(!left.empty()){
            right.push(left.pop());
        }
        while (!right.empty()){
            bw.write(right.pop());
        }
        bw.flush();
        bw.close();
    }
}
