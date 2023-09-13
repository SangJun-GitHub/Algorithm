package Ch3.PrimeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 09/11/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */

public class Main1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count = 0;
        for(int i = 0; i < N; i++){
            boolean check = prime(Integer.parseInt(st.nextToken()));
            if(check)
                count++;
        }

        System.out.println(count);
    }
    public static boolean prime(int n){
        if(n < 2){
            return false;
        }

        for(int i = 2; i * i <= n; i++){
            if(n % i == 0)
                return false;
        }

        return true;
    }
}
