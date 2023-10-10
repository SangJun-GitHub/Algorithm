package Basic02.Ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 10/08/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/15650
public class Main15650 {
    static int[] array = new int[9];
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    static StringBuilder sb_2 = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        bruteForce(0, 1, N, M);
        System.out.println(sb.toString());

        bruteForce_2(1, 0 , N, M);
        System.out.println(sb_2.toString());
    }
    public static void bruteForce(int index, int start, int n, int m){
        if(index == m){
            for(int i = 0; i < m ; i++){
                sb.append(array[i]);
                if (i != m - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
            return;
        }
        for(int i = start; i <= n; i++){
            array[index] = i;
            bruteForce(index + 1, i + 1, n, m);
        }
    }
    public static void bruteForce_2(int index, int selected, int n, int m){
        if(selected == m){
            for(int i = 0; i < m; i++){
                sb_2.append(array[i]);
                if(i != m -1)
                    sb_2.append(" ");
            }
            sb_2.append("\n");
            return;
        }
        if(index > n)
            return;
        array[selected] = index;
        bruteForce_2(index + 1, selected + 1, n, m);
        array[selected] = 0;
        bruteForce_2(index + 1, selected, n , m);
    }
}
