package Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 11/17/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/1065
public class Bruteforcing01 {
    static int N;
    public static int Bruteforcing(int n){
        int result = 0;
        int[] digits;
        for(int i = 1; i <= n; i++){
            int number;
            if(i < 100){
                result++;
            }else if(i < 1000){
                number = i;
                digits = new int[3];
                for(int j = 2; j >= 0; j--){
                    digits[j] = number % 10;
                    number /= 10;
                }
                if(digits[0] - digits[1] == (digits[1] - digits[2]))
                    result++;
            }else{
                number = i;
                digits = new int[4];
                for(int j = 3; j >= 0; j--){
                    digits[j] = number % 10;
                    number /= 10;
                }
                if(((digits[0] - digits[1]) == (digits[1] - digits[2])) && ((digits[0] - digits[1]) == (digits[2] - digits[3])))
                    result++;
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        System.out.println(Bruteforcing(N));

    }
}
