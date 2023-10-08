package Basic02.Ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 10/04/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/14500
public class Main14500 {
    static int[][] NM;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        NM = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                NM[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(bruteForce(N, M));
    }

    public static int bruteForce(int n, int m) {
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j + 3 < m) {
                    int temp = NM[i][j] + NM[i][j + 1] + NM[i][j + 2] + NM[i][j + 3];
                    if (max < temp) max = temp;
                }
                if (i + 3 < n) {
                    int temp = NM[i][j] + NM[i + 1][j] + NM[i + 2][j] + NM[i + 3][j];
                    if (max < temp) max = temp;
                }
                if (i + 1 < n && j + 2 < m) {
                    int temp = NM[i][j] + NM[i + 1][j] + NM[i + 1][j + 1] + NM[i + 1][j + 2];
                    if (max < temp) max = temp;
                }
                if (i + 2 < n && j + 1 < m) {
                    int temp = NM[i][j] + NM[i][j + 1] + NM[i + 1][j] + NM[i + 2][j];
                    if (max < temp) max = temp;
                }
                if (i + 1 < n && j + 2 < m) {
                    int temp = NM[i][j] + NM[i][j + 1] + NM[i][j + 2] + NM[i + 1][j + 2];
                    if (max < temp) max = temp;
                }
                if (i + 2 < n && j - 1 >= 0) {
                    int temp = NM[i][j] + NM[i + 1][j] + NM[i + 2][j] + NM[i + 2][j - 1];
                    if (max < temp) max = temp;
                }
                if (i - 1 >= 0 && j + 2 < m) {
                    int temp = NM[i][j] + NM[i][j + 1] + NM[i][j + 2] + NM[i - 1][j + 2];
                    if (max < temp) max = temp;
                }
                if (i + 2 < n && j + 1 < m) {
                    int temp = NM[i][j] + NM[i + 1][j] + NM[i + 2][j] + NM[i + 2][j + 1];
                    if (max < temp) max = temp;
                }
                if (i + 1 < n && j + 2 < m) {
                    int temp = NM[i][j] + NM[i][j + 1] + NM[i][j + 2] + NM[i + 1][j];
                    if (max < temp) max = temp;
                }
                if (i + 2 < n && j + 1 < m) {
                    int temp = NM[i][j] + NM[i][j + 1] + NM[i + 1][j + 1] + NM[i + 2][j + 1];
                    if (max < temp) max = temp;
                }
                if (i + 1 < n && j + 1 < m) {
                    int temp = NM[i][j] + NM[i][j + 1] + NM[i + 1][j] + NM[i + 1][j + 1];
                    if (max < temp) max = temp;
                }
                if (i - 1 >= 0 && j + 2 < m) {
                    int temp = NM[i][j] + NM[i][j + 1] + NM[i - 1][j + 1] + NM[i - 1][j + 2];
                    if (max < temp) max = temp;
                }
                if (i + 2 < n && j + 1 < m) {
                    int temp = NM[i][j] + NM[i + 1][j] + NM[i + 1][j + 1] + NM[i + 2][j + 1];
                    if (max < temp) max = temp;
                }
                if (i + 1 < n && j + 2 < m) {
                    int temp = NM[i][j] + NM[i][j + 1] + NM[i + 1][j + 1] + NM[i + 1][j + 2];
                    if (max < temp) max = temp;
                }
                if (i + 2 < n && j - 1 >= 0) {
                    int temp = NM[i][j] + NM[i + 1][j] + NM[i + 1][j - 1] + NM[i + 2][j - 1];
                    if (max < temp) max = temp;
                }
                if (j + 2 < m) {
                    int temp = NM[i][j] + NM[i][j + 1] + NM[i][j + 2];
                    if (i - 1 >= 0) {
                        int temp2 = temp + NM[i - 1][j + 1];
                        if (max < temp2) max = temp2;
                    }
                    if (i + 1 < n) {
                        int temp2 = temp + NM[i + 1][j + 1];
                        if (max < temp2) max = temp2;
                    }
                }
                if (i + 2 < n) {
                    int temp = NM[i][j] + NM[i + 1][j] + NM[i + 2][j];
                    if (j + 1 < m) {
                        int temp2 = temp + NM[i + 1][j + 1];
                        if (max < temp2) max = temp2;
                    }
                    if (j - 1 >= 0) {
                        int temp2 = temp + NM[i + 1][j - 1];
                        if (max < temp2) max = temp2;
                    }
                }
            }
        }

        return max;
    }
}
