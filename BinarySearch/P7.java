package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Sang Jun Park on 11/14/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/2512
public class P7 {
    static int[] N;
    static int M;

    public static int binarySearch(int[] N, int M){
        int start = 0;
        int end = M;
        int maxSum =0;
        int result =1;
        boolean over = false;
        while(start < end){
            int mid = (start + end) / 2;
            int sum= 0;
            for ( int n : N) {
                if(n < mid)
                    sum += n;
                else{
                    over = true;
                    sum += mid;
                }
            }

            if(sum <= M){

                if(maxSum < sum){
                    maxSum = sum;
                    result = mid;
                }
                if(!over){
                    result = N[N.length - 1];
                }
                start = mid + 1;
            } else{
                end = mid;
            }

        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = new int[Integer.parseInt(br.readLine())];
        String[] line = br.readLine().split(" ");
        for(int i = 0; i < N.length; i++){
            N[i] = Integer.parseInt(line[i]);
        }
        M = Integer.parseInt(br.readLine());
        Arrays.sort(N);
        System.out.println(binarySearch(N, M));
    }
}
