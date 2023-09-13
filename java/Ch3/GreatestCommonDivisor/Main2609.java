package Ch3.GreatestCommonDivisor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 09/11/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/2609
public class Main2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(GCD(a, b));
        System.out.println(LCM(a, b));

    }
    //Euclidean Algorithm
    //a%b = r
    //GCD(a, b) = GCD(b, r)
    public static int GCD(int a, int b){
        if (b == 0){
            return a;
        }
        else{
            return GCD(b, a%b);
        }
        // N = max(a, b)
        // Time complexity = N

        // Without recursive function
        // while(b != 0){
        //     int r = a % b;
        //     a = b;
        //     b = r;
        // }
        // return a;
        // time complexity = log N
    }


    // G = GCD(a, b)
    // a * b = GCD * LCM
    // LCM = (a * b) / GCD
    public static int LCM(int a, int b){
        int GCD = GCD(a, b);
        return (a * b) / GCD;
    }
}
