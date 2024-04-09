package Java.Baekjoon;

import java.util.*;

public class Baek2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// result 안에 0부터 1까지 몇번 쓰였는지 출력
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        String result = Integer.toString(A * B * C);

        for (int i = 0; i < 10; i++) {
            int count =0;
            for (int j = 0; j < result.length(); j++) {
                if ((result.charAt(j)-'0')==i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
