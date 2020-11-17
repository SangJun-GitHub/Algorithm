package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Sang Jun Park on 11/16/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/12015
public class P10 {
    static int[] N;
    static List<Integer> list = new ArrayList<>();
    public static int binarySearch(int[] N){
        for(int n : N){
            if(n > list.get(list.size()-1 ))
                list.add(n);
            else{
                int start = 0;
                int end = list.size() - 1;
                while(start < end){
                    int mid = (start + end) / 2;
                    if(n <= list.get(mid))
                        end = mid;
                    else
                        start = mid + 1;
                }
                list.set(end, n);
            }
        }
        return list.size() - 1;
    }
    public static void main(String[] args) throws IOException {
        list.add(0);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = new int[Integer.parseInt(br.readLine())];
        String[] line = br.readLine().split(" ");
        for(int i =0; i < N.length; i++){
            N[i] = Integer.parseInt(line[i]);
        }

        System.out.println(binarySearch(N));
    }
}
