package Ch3.PrimeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 09/11/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/1929
public class Main1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        //Sieve of Eratosthenes
        int[] prime = new int[N + 1];
        boolean[] check = new boolean[N +1];

        check[0] = check[1] = true;

        for(int i = 0; i <= N; i++){
            prime[i] = i;
        }

        for(int i = 2; i <= N; i++){
            if(!check[i]){
                for(int j = i * 2; j <= N; j += i){
                    check[j] = true;
                }
            }
        }

        for(int i = M; i <= N; i++) {
            if(!check[i])
                System.out.println(prime[i]);
        }

    }
}
