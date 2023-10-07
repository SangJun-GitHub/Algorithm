package Basic02.Ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 10/06/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */

public class Main6064 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        while(T-- > 0){
            st = new StringTokenizer(br.readLine(), " ");
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            System.out.println(bruteForce(M, N, x, y));
        }
    }
    public static int bruteForce(int M, int N, int x, int y){
        x--;
        y--;

        for(int i = x; i < (M*N); i += M){
            if(i%N == y){

                return i+1;
            }
        }
        return -1;

    }
}
