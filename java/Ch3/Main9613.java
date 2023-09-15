package Ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Sang Jun Park on 09/13/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */

public class Main9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());


        while(t-- > 0){

            st = new StringTokenizer(br.readLine(), " ");
            long[] n = new long[Integer.parseInt(st.nextToken())];

            for(int i = 0; i < n.length; i++){
                n[i] = Integer.parseInt(st.nextToken());
            }

            long result = 0;

            for(int i = 0; i < n.length - 1; i++){
                for(int j = i + 1; j < n.length; j++)
                    result +=  GCD(n[i], n[j]);
            }
            System.out.println(result);
        }
    }
    public static long GCD(long a, long b){
        if(b == 0){
            return a;
        }
        return GCD(b, a%b);
    }
}
