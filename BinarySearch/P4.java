package BinarySearch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Sang Jun Park on 11/10/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/1654

public class P4 {
    //K개의 랜선
    //N개의 필요
    static int[] K;
    static int N;

    public static int binarySearch(int[] K, int N){
        long min = 1;
        long max = K[K.length - 1];
        long mid = 0;

        while(max >= min){
            mid = (max + min)/2;
            long cutNumber = 0;

            for(int j = 0; j < K.length; j++){
                cutNumber += K[j]/mid;
            }
            if(cutNumber >= N)
                min = mid + 1;
            else if(cutNumber < N)
                max = mid - 1;
        }
        return (int)max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int number = Integer.parseInt(firstLine[0]);
        N = Integer.parseInt(firstLine[1]);

        K = new int[number];
        for(int i = 0; i < K.length; i++){
            K[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(K);

        System.out.println(binarySearch(K, N));

    }
}
