package Java.Baekjoon;

import java.util.Scanner;

public class Baek2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N <= 100){
            for(int i = 0; i < N; i++){
                for(int j = 0; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
