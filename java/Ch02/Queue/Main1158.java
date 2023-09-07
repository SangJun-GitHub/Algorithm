package Ch02.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Sang Jun Park on 9/5/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
public class Main1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder  sb = new StringBuilder();

        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int K = Integer.parseInt(line[1]);

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i < N + 1; i++){
            queue.add(i);
        }

        sb.append("<");
        int index = 0;
        while(!queue.isEmpty()){
            index++;
            if(index % K == 0)
                sb.append(queue.remove()).append(", ");
            else
                queue.add(queue.remove());

        }

        System.out.println(sb.substring(0, sb.length() -2) + ">");
    }
}
