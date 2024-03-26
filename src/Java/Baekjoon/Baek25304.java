package Java.Baekjoon;

import java.util.Scanner;

public class Baek25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); //영수증 총 가격
        int N = sc.nextInt(); // 물건 종류 수

        int total = 0; //총 합

        for(int i = 0; i < N; i++){
            int a = sc.nextInt(); //물건 가격
            int b = sc.nextInt(); //물건 개수

            total += a*b; //가격과 개수 더해서 총 합을 구함
        }
        if(X == total){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
