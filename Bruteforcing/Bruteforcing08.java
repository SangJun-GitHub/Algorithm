package Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 11/20/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/10448
public class Bruteforcing08 {
    static int[] triangularN = new int[45];
    static int[] K;
    public static int Brutefrocing(int k){
        int answer = 0;
        for(int a = 0; a < triangularN.length; a++){
            for(int b = 0; b < triangularN.length; b++){
                for(int c = 0; c < triangularN.length; c++){
                    if((triangularN[a]+triangularN[b]+triangularN[c]) == k){
                        answer = 1;
                        break;
                    }
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        for(int i = 1 ; i < triangularN.length + 1; i++){
            triangularN[i-1] = i*(i+1)/2;
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        K = new int[T];
        for(int i = 0; i< K.length; i++){
            K[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i< K.length; i++){
            System.out.println(Brutefrocing(K[i]));
        }

    }
}
