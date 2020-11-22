package Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sang Jun Park on 11/19/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/2231
public class Bruteforcing04 {
    static int N;
    static List<Integer> result = new ArrayList<>();
    public static void bruteforcing(int N){
        int temp;
        for(int i = 1; i < N; i++){
            int sum = 0;
            temp = i;
            while(temp > 0){
                sum += temp %10;
                temp = temp /10;
            }
            sum += i;
            if(sum == N){
                result.add(i);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        bruteforcing(N);
        if(!result.isEmpty()){
            System.out.println(result.get(0));

        }else {
            System.out.println(0);
        }

    }
}
