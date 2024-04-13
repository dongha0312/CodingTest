package Java.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek1598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());

        //Math.abs() = 절대값으로 변환
        int x = Math.abs(((m1-1)/4) - ((m2-1)/4));
        int y = Math.abs(((m1-1)%4) - ((m2-1)%4));

        int dis = x+y;
        System.out.println(dis);
    }
}
