package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Sang Jun Park on 11/13/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/10816

public class B06 {
    static int[] N;
    static int[] M;

    public static int binarySearchLow(int[] N, int m){
        int start = 0;
        int end = N.length;
        while(start < end){
            int mid = (start + end) / 2;
            if(N[mid] >= m)
                end = mid;
            else
                start = mid + 1;
        }
        return  start;
    }
    public static int binarySearchUpper(int[] N, int m){
        int start = 0;
        int end = N.length;
        while(start < end) {
            int mid = (start + end) / 2;
            if(m >= N[mid])
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = new int[Integer.parseInt(br.readLine())];
        String[] card = br.readLine().split(" ");
        for(int i = 0; i < N.length; i++){
            N[i] = Integer.parseInt(card[i]);
        }

        M = new int[Integer.parseInt(br.readLine())];
        String[] check = br.readLine().split(" ");
        for(int i = 0; i < M.length; i++){
            M[i] = Integer.parseInt(check[i]);
        }

        Arrays.sort(N);
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < M.length; i++){
            sb.append(binarySearchUpper(N, M[i]) - binarySearchLow(N, M[i]) + " ");
        }
        System.out.println(sb.toString());
    }
}
