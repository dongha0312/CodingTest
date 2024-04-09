package Java.Baekjoon;

import java.util.Scanner;

public class Baek2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5]; //고유번호 첫 5자리
        int total= 0;

        for (int i =  0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            total += arr[i]*arr[i];
        }
        System.out.println(total%10);
    }
}
