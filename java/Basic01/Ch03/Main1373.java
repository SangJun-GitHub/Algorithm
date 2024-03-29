package Basic01.Ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 09/13/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/1373
public class Main1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String N = br.readLine();

        if(N.length() % 3 == 1)
            sb.append(N.charAt(0));

        if(N.length() % 3 == 2)
            sb.append((N.charAt(0) - '0') * 2 + (N.charAt(1) - '0'));

        for(int i = N.length() % 3; i < N.length(); i+=3) {
            sb.append((N.charAt(i) - '0') * 4 + (N.charAt(i+1) - '0') * 2 + (N.charAt(i+2) - '0'));
        }
        System.out.println(sb);
    }
}
