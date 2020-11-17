package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sang Jun Park on 10/22/2020.
 * Github : http://github.com/SangJun-GitHub
 **/
//https://www.acmicpc.net/problem/1920


public class B01 {
    static int[] A;
    public static int binarySearch(int []array, int key){
        int start = 0;
        int end = array.length -1;
        while(start <= end){
            int mid = start + (end - start) /2;
            if(key < array[mid])
                end = mid -1;
            else if(key > array[mid])
                start = mid + 1;
            else
                return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        A = new int[input];
        for(int i = 0; i < input; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int input2 = sc.nextInt();
        int number;
        for(int i = 0 ; i < input2; i++){
            number = sc.nextInt();
            System.out.println(binarySearch(A,number));
        }
    }
}
