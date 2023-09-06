package Ch02;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 9/1/2023.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/10828
public class Main10828 {
    interface Stack {
        void push(int x);
        int pop();
        int size();
        int empty();
        int top();
    }
    static class ArrayStack implements Stack{
        int size;
        int[] data = new int[10000];

        ArrayStack(){
            size = 0;
        }
        @Override
        public void push(int x) {
            data[size] = x;
            size++;
        }

        @Override
        public int pop() {
            if(size() == 0){
                return -1;
            }else {
                size--;
                return data[size];
            }
        }

        @Override
        public int size() {
            return size;
        }

        @Override
        public int empty() {
            return size == 0 ? 1 : 0;
        }

        @Override
        public int top() {
            if(size() == 0){
                return -1;
            }else {
                return data[size -1];
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        ArrayStack as = new ArrayStack();
        while(N-- > 0){

            st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()){
                case "push":
                    as.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(as.pop()).append('\n');
                    break;
                case "size":
                    sb.append(as.size).append('\n');
                    break;
                case "empty":
                    sb.append(as.empty()).append('\n');
                    break;
                case "top":
                    sb.append(as.top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
        br.close();
    }
}
