package Java.Baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        StringTokenizer st = new StringTokenizer(S, " ");

        System.out.println(st.countTokens());
    }
}
