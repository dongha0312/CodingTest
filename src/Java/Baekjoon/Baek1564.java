package Java.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1564 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long n = Integer.parseInt(br.readLine());
        long num = 1;
        long k = (long)1e12;

        for(long i=1; i<=n; i++) {
            num *=i;
            while(num%10==0)
                num/=10;
            num%=k;
        }

        num %= 100000;
        if(num<10000) sb.append(0);
        if(num<1000) sb.append(0);
        if(num<100) sb.append(0);
        if(num<10) sb.append(0);
        sb.append(num);
        System.out.print(sb);
    }
}
