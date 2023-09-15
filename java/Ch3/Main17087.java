package Ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 09/13/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/17087
public class Main17087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        long[] distances = new long[N];
        long S = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            distances[i] = Math.abs(S - Long.parseLong(st.nextToken()));
        }

        long result = distances[0];
        for(int i = 1; i < N; i++){
            result = GCD(result, distances[i]);
        }

        System.out.println(result);
    }
    public static long GCD(long a, long b){
        if(b == 0)
            return a;

        return GCD(b, a%b);
    }
}
