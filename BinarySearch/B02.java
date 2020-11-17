package BinarySearch;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sang Jun Park on 10/22/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/2805
public class B02 {

    static int[]trees;
    public static int binarySearch(int[] trees, int amount){
        int maxHeight = trees[trees.length - 1];
        int minHeight = 0;
        while(maxHeight >= minHeight){
            int mid = (maxHeight + minHeight) / 2;
            if(cut(trees, mid, amount))
                minHeight = mid + 1;
            else
                maxHeight = mid - 1;

        }
        return maxHeight;
    }
    public static boolean cut(int[] trees, int cut, int amount){
        long sum = 0;
        for(int tree : trees)
            sum += Math.max(tree - cut, 0);
        if(sum >= amount)
            return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int amount = sc.nextInt();
        trees = new int[input];
        for(int i = 0 ; i < input; i++){
            trees[i] = sc.nextInt();
        }
        Arrays.sort(trees);
        System.out.println(binarySearch(trees, amount));

    }
}
