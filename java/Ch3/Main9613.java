package Ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Sang Jun Park on 09/13/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/9613
public class Main9613 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        while(t-- > 0){
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            long[] numbers = new long[n];
            for(int i = 0; i < n; i++){
                numbers[i] = Long.parseLong(st.nextToken());
            }

            long result = 0;
            for(int i = 0; i < n - 1; i++){
                for(int j = i + 1; j < n; j++)
                    result += GCD(numbers[i], numbers[j]);
            }
            System.out.println(result);
        }

    }
    public static long GCD(long a, long b){
        if(b == 0)
            return a;

        return GCD(b, a%b);
    }
}
