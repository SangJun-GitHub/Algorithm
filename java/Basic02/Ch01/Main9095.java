package Basic02.Ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 10/08/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/9095
public class Main9095 {
    static int result = 0;
    static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(bruteForce(n));
        }
    }

    public static int bruteForce(int n) {
        if (n == 1) {
            return 1;           // 1
        } else if (n == 2) {
            return 2;           // 11, 2
        } else if (n == 3) {
            return 4;           // 111, 12, 21, 3
        } else if (n == 0) {
            return 0;
        } else {
            return bruteForce(n - 3) + bruteForce(n - 2) + bruteForce(n - 1);
        }
    }
}
