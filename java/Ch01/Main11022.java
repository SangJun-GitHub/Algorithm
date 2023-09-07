package Ch01;
import java.util.Scanner;

/**
 * Created by Sang Jun Park on 7/8/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/11022
public class Main11022 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for(int i = 1; i < size + 1; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.printf("Case #%d: %d + %d = %d%n", i , a, b, (a+b));
        }
    }

}
