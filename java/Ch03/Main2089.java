package Ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 09/13/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/2089
public class Main2089 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double N = Double.parseDouble(br.readLine());
        StringBuilder sb = new StringBuilder();
        //ex)
        // -13 = (-2 *  7) + 1          // -13 / -2 =  6.5 =  7
        //   7 = (-2 * -3) + 1          //   7 / -2 = -3.5 = -3
        //  -3 = (-2 *  2) + 1          //  -3 / -2 =  1.5 =  2
        //   2 = (-2 * -1) + 0          //   2 / -2 = -1   = -1
        //  -1 = (-2 *  1) + 1          //   1 / -2 =  0.5 =  1
        //   1
        if (N == 0) {
            sb.append(0);
        } else {
            while(N != 1){
                sb.append((int)Math.abs(N % -2));
                double x = N / -2;
                N = Math.ceil(N / -2);
            }
            sb.append((int)N);
        }
        System.out.println(sb.reverse());
    }
}
