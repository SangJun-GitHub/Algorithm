package Ch01;
import java.util.Scanner;

/**
 * Created by Sang Jun Park on 7/8/2023.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/11021
public class Main11021 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for(int i = 0; i < size; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.printf("Case #%d: %d%n", (i+1), (a+b));
        }
    }
}


