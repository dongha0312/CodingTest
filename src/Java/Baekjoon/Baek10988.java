package Java.Baekjoon;

import java.util.Scanner;

public class Baek10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int len = S.length();
        int ans = 1;
        for(int i = 0; i < len/2; i++){
            if(S.charAt(i) != S.charAt(len-i-1)){
                ans = 0;
            }
        }
        System.out.println(ans);
    }
}
