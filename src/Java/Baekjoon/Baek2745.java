package Java.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken(); // B진법의 값인 N
        int B = Integer.parseInt(st.nextToken()); //몇 진법인지
        br.close();

        //ex) 2진법인 경우 2^0 2^1 2^2 ... 곱하는 것처럼
        int tmp = 1; // 몇진법인지 알기 위해서는 각 문자마다 해당 자리 수 B만큼 곱해주어야함.
        int sum = 0; // 마지막에 출력할 숫자를 의미

        for(int i = N.length()-1 ; i >= 0; i--){ // 여기서, 맨오른쪽 부터 계산!
            char C = N.charAt(i);

            if ('A' <= C && C<= 'Z') {
                sum += (C - 'A' + 10) * tmp;
            } else {
                sum += (C - '0') * tmp;
            }
            tmp *= B;
        }

        System.out.println(sum);
    }
}
