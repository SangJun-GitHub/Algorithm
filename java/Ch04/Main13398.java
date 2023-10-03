package Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 10/02/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/13398
public class Main13398 {
    static int[] headDp;
    static int[] tailDp;
    static int[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        headDp = new int[n];
        tailDp = new int[n];
        A = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(bottomUp(n));
    }
    public static int bottomUp(int n){
        for(int i = 0; i < n; i++){
            headDp[i] = A[i];
            if(i == 0)
                continue;
            if(headDp[i] < headDp[i - 1] + A[i])
                headDp[i] = headDp[i -1] + A[i];
        }
        for(int i = n - 1; i >= 0; i--){
            tailDp[i] = A[i];
            if(i == n - 1)
                continue;
            if(tailDp[i] < tailDp[i + 1] + A[i])
                tailDp[i] = tailDp[i + 1] + A[i];
        }
        int max = headDp[0];;
        for(int i = 1; i < n; i++){
            if(headDp[i] > max)
                max = headDp[i];
        }
        for(int i = 1; i < n - 1; i++){
            if(headDp[i - 1] + tailDp[i + 1] > max)
                max = headDp[i - 1] + tailDp[i + 1];
        }

        return max;
    }
}
