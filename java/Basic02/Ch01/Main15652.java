package Basic02.Ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 10/09/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/15652
public class Main15652 {
    static int[] array = new int[9];
    static boolean[] check = new boolean[9];
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        bruteForce(0, 1, N, M);
        System.out.println(sb);
    }
    public static void bruteForce(int index, int start, int n, int m){
        if(index == m){
            for(int i = 0; i < m; i++){
                sb.append(array[i]);
                if(i != m - 1)
                    sb.append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = start; i <= n; i++){
            array[index] = i;
            bruteForce(index + 1, i, n, m);
        }
    }
}
