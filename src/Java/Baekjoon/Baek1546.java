package Java.Baekjoon;

import java.util.Scanner;

public class Baek1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //과목 수
        double [] arr = new double[N];
        double M = -1000; //최댓값 구하는 변수
        double total =0; //총합 점수

        for (int i =0; i < arr.length; i++){ //각 과목 점수 저장
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++){//최댓값 구하기;
            if (arr[i] >M){
                M= arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++){ //새로 고친 점수, 점수 총합 구하기
            arr[i] = arr[i]/M*100;
            total += arr[i];
        }

        System.out.println(total/N); //평균
    }
}
