package Basic02.Ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 10/09/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/15654
public class Main15654 {
    static int N;
    static int M;
    static int[] nums = new int[9];
    static int[] array = new int[9];
    static boolean[] check = new boolean[9];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        nums = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums, 0, N);
        System.out.println(bruteForce(0, N, M));
    }
    public static StringBuilder bruteForce(int index, int n, int m){
        if(index == m){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < m; i++){
                sb.append(nums[array[i]]);
                if(i != m - 1)
                    sb.append(" ");
            }
            sb.append("\n");
            return sb;
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(check[i])
                continue;

            check[i] = true;
            array[index] = i;
            ans.append(bruteForce(index + 1, n, m));
            check[i] = false;
        }
        return ans;
    }
}
