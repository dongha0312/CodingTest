package Java.Baekjoon;

import java.util.Scanner;

public class Baek20492 {
    static void solve(int n){
        System.out.println((int)(n*0.78) + " " +(int)(n*0.8 + (n*0.2*0.78)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        solve(n);
    }
}
