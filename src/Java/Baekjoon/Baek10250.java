package Java.Baekjoon;

import java.util.Scanner;

public class Baek10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // amount of test data

        for (int i = 0; i < T;i++){
            int H = sc.nextInt();
            int W = sc.nextInt(); //필요없음
            int N = sc.nextInt();

            if(N % H == 0) {
                System.out.println((H * 100) + (N / H));

            } else {
                System.out.println(((N % H) * 100) + ((N / H) + 1));
            }
        }


    }
}
