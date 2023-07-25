package Ch01;
import java.util.Scanner;

/**
 * Created by Sang Jun Park on 7/8/2023.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/2558

public class Main2558{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;

        while(sc.hasNext()){
            result += sc.nextInt();
        }
        System.out.println(result);
    }
}
