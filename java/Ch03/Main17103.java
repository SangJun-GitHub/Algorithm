package Ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 09/13/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/17103
public class Main17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        boolean[] prime = new boolean[1_000_000];

        prime[0] = prime[1] = true;

        for(int i = 2; i * 2 <= prime.length - 1; i++){
            if(!prime[i]){
                for(int j = i * 2; j <= prime.length -1; j += i){
                    prime[j] = true;
                }
            }
        }
        while(T-- > 0){
            int n = Integer.parseInt(br.readLine());
            int result = 0;
            for(int i = 2; i <= n / 2; i++){
                if(!prime[i] && !prime[n - i])
                    result++;
            }
            System.out.println(result);
        }
    }
}
