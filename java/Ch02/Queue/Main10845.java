package Ch02.Queue;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 9/5/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
public class Main10845 {
    static class Queue{
        int[] data = new int[10000];
        int start = 0;
        int end = 0;

        void push(int num){
            data[end] = num;
            end++;
        }
        int pop(){
            if(empty())
                return -1;
            else{
                start++;
                return data[start - 1];
            }

        }
        int size(){
            return end - start;

        }
        boolean empty(){
            return end == start;
        }
        int front(){
            if(empty())
                return -1;
            else
                return data[start];
        }
        int back(){
            if(empty())
                return -1;
            else
                return data[end - 1];
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Queue queue = new Queue();

        while(N-- > 0){
            st = new StringTokenizer(br.readLine(), " ");


            switch (st.nextToken()){
                case "push":
                    queue.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    bw.write(queue.pop() + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    bw.write((queue.empty() ? 1 : 0) + "\n");
                    break;
                case "front":
                    bw.write(queue.front() + "\n");
                    break;
                case "back":
                    bw.write(queue.back()+ "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
