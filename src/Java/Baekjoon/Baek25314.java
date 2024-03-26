package Java.Baekjoon;

import java.util.Scanner;

public class Baek25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //4의 배수

        if(N % 4 == 0){
            int count = N/4; //프린트 해야될 long 카운트
            for(int i = 0; i < count; i++){
                System.out.print("long ");
            }
            System.out.println("int");
        }
    }
}
