package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 11/16/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/1789
public class P9 {
    static long S;
    public static long binarySearch(long s){
        long start = 1;
        long end = s;
        long answer = 0;
        while(start <= end){
            long mid = (start + end) / 2;
            long sum = 0;
            boolean over = false;
            for(int i = 1; i <=mid; i++){
                sum += i;
                if(sum > s){
                    end = mid -1;
                    over = true;
                    break;
                }
            }
            if(sum == s){
                return mid;
            }else if(!over){
                answer = mid;
                start = mid + 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S = Long.parseLong(br.readLine());
        System.out.println(binarySearch(S));
    }
}
