package Java.Baekjoon;

import java.util.Scanner;

public class Baek27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();
        int n = sc.nextInt()-1;
        sc.close();

        System.out.println(st.charAt(n));
    }
}
