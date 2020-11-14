package BinarySearch;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sang Jun Park on 11/10/2020.
 * Github : http://github.com/SangJun-GitHub
 */
//https://www.acmicpc.net/problem/10815

public class P3 {
    //갖고있는 카드개수 N
    static int[] nCards;
    //비교할 카드수 M
    static int[] mCards;

    public static int binarySearch(int[] cards, int number){
        int start = 0;
        int end = cards.length -1;
        while(start <= end){
            int mid = start + (end - start) /2;
            if(number < cards[mid])
                end = mid - 1;
            else if (number > cards[mid])
                start = mid + 1;
            else
                return 1;
        }
        return 0;
        //갖고있을시 1 없을시 0
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int number;
        nCards = new int[N];
        for(int i = 0; i < N; i++){
            number = scanner.nextInt();
            //카드에 수 -10,000,000 <= M  <= 10,000,000
            while(number < -10000000 || number > 10000000){
                System.out.println("The Number M must in -10,000,000 < M < 10,000,000");
                number = scanner.nextInt();
            }
            nCards[i] = number;
        }
        Arrays.sort(nCards);
        int M = scanner.nextInt();
        while(M < 1 || M > 500000){
            System.out.println("The M number is must in M >= 1 || M <= 500000");
            M = scanner.nextInt();
        }
        mCards = new int[M];
        for(int i = 0; i < M; i++){
            number = scanner.nextInt();
            //카드에 수 -10,000,000 <= M  <= 10,000,000
            while(number < -10000000 || number > 10000000){
                System.out.println("The Number M must in -10,000,000 < M < 10,000,000");
                number = scanner.nextInt();
            }
            mCards[i] = number;
        }
        for(int j = 0; j < mCards.length; j++){
            System.out.print(binarySearch(nCards, mCards[j]) + " ");
        }
    }
}
