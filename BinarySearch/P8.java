package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Sang Jun Park on 11/15/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/2110
public class P8 {
    static int[] N;
    static int M;

    public static int binarySearch(int[] N, int m){
        int start = 1;
        int end = N[N.length - 1] - N[0];
        int interval = 0;
        int distance = 0;

        while(start <= end){
            int mid = (start + end) / 2;
            int router = N[0];
            int count = 1;
            for(int i = 1; i < N.length; i++){
                interval = N[i] - router;
                if(mid <= interval){
                    count++;
                    router = N[i];
                }
            }
            if(count >= m){
                distance = mid;
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return distance;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        N = new int[Integer.parseInt(line[0])];
        M = Integer.parseInt(line[1]);
        for(int i = 0; i < N.length; i++){
            N[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(N);
        System.out.println(binarySearch(N, M));
    }
}
