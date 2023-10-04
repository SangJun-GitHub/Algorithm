package Basic01.Ch03.PrimeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 09/11/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/6588
public class Main6588 {
    public static void main(String[] args) throws IOException {
        boolean[] prime = new boolean[1000001];
        prime[0] = prime[1] = true;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 2; i < prime.length; i++){
            if(!prime[i]){
                for(int j = i * 2; j < prime.length; j += i)
                    prime[j] = true;
            }
        }

        int n = Integer.parseInt(br.readLine());

        while(n != 0){
            boolean isProve = false;
            for(int i = 2; i <= n / 2; i++){
                if(!prime[i] && !prime[n-i]){
                    isProve = true;
                    System.out.println(n + " = " + i + " + " + (n - i));
                    break;
                }
            }
            if(!isProve)
                System.out.println("Goldbach's conjecture is wrong.");

            n = Integer.parseInt(br.readLine());
        }

    }
}
