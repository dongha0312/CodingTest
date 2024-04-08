package Java.Baekjoon;

import java.util.Scanner;

public class Baek2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 1; //겹 수 (최소 루트)
        int range = 2; // 범위( 최솟값 기준)

        if (N == 1){
            System.out.println(1);
            return;
        }
        else {
            while (range <= N){     //N 보다 범위가 커질때 까지 반복
                range = range + (6 * count);	// 다음 범위의 최솟값으로 초기화
                count++;	// count 1 증가
            }
        }
        System.out.println(count);
    }
}
