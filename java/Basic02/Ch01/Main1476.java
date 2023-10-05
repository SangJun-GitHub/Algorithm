package Basic02.Ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 10/04/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/1476
public class Main1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int earth = Integer.parseInt(st.nextToken());
        int sun   = Integer.parseInt(st.nextToken());
        int moon  = Integer.parseInt(st.nextToken());

        System.out.println(bruteForce(earth, sun, moon));
    }
    public static int bruteForce(int earth, int sun, int moon){
        int e = 1;
        int s = 1;
        int m = 1;
        for(int i = 1;; i++){
            if(e == earth && s == sun && m == moon){
                return i;
            }
            e++;
            s++;
            m++;
            if(e == 16)
                e = 1;
            if(s == 29)
                s = 1;
            if(m == 20)
                m = 1;
        }
    }
}
