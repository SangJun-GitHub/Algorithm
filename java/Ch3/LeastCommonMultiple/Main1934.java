package Ch3.LeastCommonMultiple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 09/11/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/1934
public class Main1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        while(T-- > 0){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(LCM(a, b));
        }

    }
    public static int GCD(int a, int b){
        if(b == 0){
            return a;
        }
        return GCD(b, a%b);
    }
    public static int LCM(int a, int b){
        int GCD = GCD(a, b);
        return (a * b) / GCD;
    }
}
