package Java.Baekjoon;

import java.util.Scanner;

public class Baek2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i < 10; i++){
            System.out.println(N + " * " + i +" = " + (N*i));
        }
    }
}
