package Java.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baek1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            int isPrime = Integer.parseInt(st.nextToken());
            for(int p=2; p<=isPrime; p++){
                if(p == isPrime){
                    count++;
                }
                if(isPrime % p == 0){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
