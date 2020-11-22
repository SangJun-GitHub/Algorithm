package Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 11/19/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/7568
public class Bruteforcing05 {
    static int[] weight;
    static int[] height;
    public static void bruteforcing(int[] w, int[] h, int n){
        int[] result = new int[n];
        for(int i =0; i < n; i++){
            result[i] = 1;
        }
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(weight[i] > weight[j] && height[i] > height[j]){
                    result[j] += 1;
                }else if(weight[i] < weight[j] && height[i] < height[j]){
                    result[i] += 1;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(result[i] + " ");
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        weight = new int[n];
        height = new int[n];
        for(int i =0; i < n; i++){
            String[] line = br.readLine().split(" ");
            weight[i] = Integer.parseInt(line[0]);
            height[i] = Integer.parseInt(line[1]);
        }
        bruteforcing(weight, height, n);
    }
}
