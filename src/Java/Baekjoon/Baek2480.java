package Java.Baekjoon;

import java.util.Scanner;

public class Baek2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //다 같을때
        if(a == b && b == c ){
            System.out.println(10000 + (b * 1000));
        }
        //두개만 같음
        else if(a == b || a == c){
            System.out.println(1000 + (a * 100));
        }
        else if(b == c){
            System.out.println(1000 + (b * 100));
        }
        //다 다름
        else if(a > b && a > c){
            System.out.println(a *100);
        }else if(b > a && b > c){
            System.out.println(b*100);
        }else if (c > a && c > b){
            System.out.println(c*100);
        }
    }
}
