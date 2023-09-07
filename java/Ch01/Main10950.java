package Ch01;
import java.util.Scanner;

/**
 * Created by Sang Jun Park on 7/8/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/10950
public class Main10950 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] results = new int[size];


        for(int i = 0; i < size; i++){
             int a = sc.nextInt();
             int b = sc.nextInt();
             results[i] = a + b;
        }
        for(int i = 0; i < size; i++){
            System.out.println(results[i]);
        }
    }
}