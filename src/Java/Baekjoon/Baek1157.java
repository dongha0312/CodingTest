package Java.Baekjoon;

import java.util.Scanner;

public class Baek1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []arr = new int[26]; //알파벳의 겟수

        String S = sc.next();
        for (int i = 0; i < S.length(); i++){

            if ('A' <= S.charAt(i) && S.charAt(i) <= 'Z') { // 대문자 범위
                arr[S.charAt(i) - 'A']++;	// 해당 인덱스의 값 1 증가
            }

            else {	// 소문자 범위
                arr[S.charAt(i) - 'a']++;
            }

        }
        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}
