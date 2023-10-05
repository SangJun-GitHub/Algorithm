package Basic02.Ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 10/04/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/1107
public class Main1107 {
    static boolean[] broken = new boolean[10];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        if (M != 0){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < M; i++) {
                broken[Integer.parseInt(st.nextToken())] = true;
            }
        }
        System.out.println(bruteForce(N));
    }
    public static int bruteForce(int n){
        int result = Math.abs(n - 100);         // number of cases of only press + or -

        for(int i = 5445 ; i <= 10_000_000; i++){
            int length = check(i);              // length = matched unbroken button with channel
            if(length > 0){
                int press = Math.abs(i - n);    // gap between channel and i = number of + , -
                if(result > length + press)
                    result = length + press;
            }
        }
        return result;
    }
    public static int check(int channel){
        if(channel == 0){
            return broken[0] ? 0 : 1;
        }

        int length = 0;
        while(channel > 0){
            if(broken[channel % 10])
                return 0;               // if there is broken button return 0
            length += 1;                // total of matched button
            channel /= 10;
        }
        return length;
    }
}
