package Ch01;
import java.util.Scanner;

/**
 * Created by Sang Jun Park on 7/8/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/10953
public class Main10953 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] results = new int[size];

        for(int i = 0; i < size; i++){
            String s = sc.next();
            String[] strArr = s.split(",");

            results[i] = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]);
            System.out.println(results[i]);
        }

    }
}
