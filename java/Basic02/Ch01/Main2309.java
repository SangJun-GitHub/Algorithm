package Basic02.Ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Sang Jun Park on 10/04/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/2309
public class Main2309 {
    static int[] data = new int[9];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < data.length; i++){
            data[i] = Integer.parseInt(br.readLine());
        }

        bruteForce();
    }
    public static void bruteForce(){
        int sum = 0;

        for (int i : data) {
            sum += i;
        }

        Arrays.sort(data);

        for(int i = 0; i < data.length; i++){
            for(int j = i + 1; j < data.length; j++){
                if((sum - (data[i] + data[j]) == 100)){
                    for(int k = 0; k < data.length; k++){
                        if(i == k || j == k)
                            continue;
                        System.out.println(data[k]);
                    }
                    return;
                }
            }
        }
    }
}
