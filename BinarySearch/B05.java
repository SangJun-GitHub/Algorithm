package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Sang Jun Park on 11/12/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/1764

public class B05 {
    static String[] N;
    static String[] M;
    static int number = 0;
    static List<String> answer = new ArrayList<>();

    public static void binarySearch(String[] N, String m){
        int start = 0;
        int end = N.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int x = m.compareTo(N[mid]);
            if(x == 0){
                number++;
                answer.add(m);
                start = end + 1;
            }else if(x > 0){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        N = new String[Integer.parseInt(firstLine[0])];
        M = new String[Integer.parseInt(firstLine[1])];
        for(int i =0; i < N.length; i++){
            N[i] = br.readLine();
        }
        for(int i = 0; i < M.length; i++){
            M[i] = br.readLine();
        }
        Arrays.sort(N);
        Arrays.sort(M);
        for (String s : M) {
            binarySearch(N, s);
        }
        System.out.println(number);
        for (String a : answer) {
            System.out.println(a);
        }
    }
}
