package Java.Baekjoon;

import java.util.Scanner;

public class Baek1676 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact, nonZeroNumber;
        int n = sc.nextInt();

//        nZero = N/5 + N/25 + N/125;

        for(int i = 2; i <= n; i++){
            fact = fact*i;
            while(fact%10 == 0){
                fact/=10;
            }
            fact = fact%1000000;
        }

        nonZeroNumber = fact%100000;

    }
}
