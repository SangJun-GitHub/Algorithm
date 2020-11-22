package Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Sang Jun Park on 11/17/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/2309
public class Bruteforcing03 {
    static int[] dwarf = new int[9];
    static int[] wrong = new int[2];

    public static void bruteforcing(int[]dwarf){
        int sum = 0;
        for(int d : dwarf){
            sum += d;
        }
        for(int i = 0; i < dwarf.length - 1; i++){
            for(int j = i + 1; j < dwarf.length; j++){
                int temp = sum;
                temp -= dwarf[i];
                temp -= dwarf[j];
                if(temp == 100){
                    wrong[0] = dwarf[i];
                    wrong[1] = dwarf[j];
                    break;
                }
            }
        }
        for(int i = 0; i < dwarf.length; i++){
            if (dwarf[i] != wrong[0] && dwarf[i] != wrong[1])
                System.out.println(dwarf[i]);
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < dwarf.length; i++){
            dwarf[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(dwarf);
        bruteforcing(dwarf);
    }
}
