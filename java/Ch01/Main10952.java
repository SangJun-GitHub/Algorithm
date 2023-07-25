package Ch01;
import java.util.Scanner;

/**
 * Created by Sang Jun Park on 7/8/2023.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/10952
public class Main10952 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == 0 & b == 0)
                continue;
            System.out.println(a+b);
        }
    }
}
