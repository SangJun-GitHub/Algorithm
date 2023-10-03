package Ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 10/02/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/11054
public class Main11054 {
    static int[] decreaseDp;
    static int[] increaseDp;
    static int[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        decreaseDp = new int[N];
        increaseDp = new int[N];
        A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(bottomUp(N));
    }
    public static int bottomUp(int n){
        for(int i = 0; i < n; i++){
            increaseDp[i] = 1;
            for(int j = 0; j < i; j++){
                if(A[j] < A[i] && increaseDp[i] < increaseDp[j] + 1){
                    increaseDp[i] = increaseDp[j] + 1;
                }
            }
        }
        for(int i = n - 1; i >= 0; i--){
            decreaseDp[i] = 1;
            for(int j = i + 1; j < n; j++){
                if(A[j] < A[i] && decreaseDp[i] < decreaseDp[j] + 1){
                    decreaseDp[i] = decreaseDp[j] + 1;
                }
            }
        }
        int max = -1;
        for(int i = 0; i < n; i++){
            if(max < increaseDp[i] + decreaseDp[i] - 1)
                max = increaseDp[i] + decreaseDp[i] - 1;
        }

        return max;
    }
}
