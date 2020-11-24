package Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 11/20/2020.
 * Github : http://github.com/SangJun-GitHub
 */
public class Bruteforcing07 {
    static String[][] candy;
    static int N;
    public static int Bruteforcing(String[][] candy){
        int answer = 1;
        for(int i = 0; i < candy.length; i++){
            for(int j = 0; j < candy.length - 1; j++){
                String ch = candy[i][j];
                candy[i][j] = candy[i][j + 1];
                candy[i][j + 1] = ch;
                int max = check(candy);
                ch = candy[i][j + 1];
                candy[i][j + 1] = candy[i][j];
                candy[i][j] = ch;
                if(max > answer)
                    answer = max;
            }
        }
        for(int i = 0; i < candy.length; i++){
            for(int j = 0; j < candy.length - 1; j++){
                String ch = candy[j][i];
                candy[j][i] = candy[j + 1][i];
                candy[j + 1][i] = ch;
                int max = check(candy);
                ch = candy[j + 1][i];
                candy[j + 1][i] = candy[j][i];
                candy[j][i] = ch;
                if(max > answer)
                    answer = max;
            }
        }

        return answer;
    }
    public static int check(String[][] temp){
        int max = 1;
        for(int i = 0; i < temp.length; i++){
            int count = 1;
            for(int j = 1; j < temp.length; j++){
                if(temp[i][j].equals(temp[i][j-1]))
                    ++count;
                else{
                    if(count > max){
                        max = count;
                        count = 1;
                    }
                }
            }
            if(count > max)
                max = count;
        }

        for(int i = 0; i < temp.length; i++){
            int count = 1;
            for(int j = 1; j < temp.length; j++){
                if(temp[j][i].equals(temp[j-1][i]))
                    ++count;
                else{
                    if(count > max){
                        max = count;
                        count = 1;
                    }
                }
            }
            if(count > max)
                max = count;
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        candy = new String[N][N];
        for(int i = 0; i < N; i++){
            String[] line = br.readLine().split("");
            for(int j = 0; j < N; j++){
                candy[i][j] = line[j];
            }
        }
        System.out.println(Bruteforcing(candy));
    }

}
