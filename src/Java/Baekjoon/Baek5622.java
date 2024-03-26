package Java.Baekjoon;

import java.util.Scanner;

public class Baek5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        int count = 0;
        //각 알파벳 누를 때 마다 주어진 초 추가

        for(int i = 0; i < S.length(); i++){
            switch(S.charAt(i)){

                case 'A' : case 'B': case 'C' :
                    count += 3;
                    break;

                case 'D' : case 'E': case 'F' :
                    count += 4;
                    break;

                case 'G' : case 'H': case 'I' :
                    count += 5;
                    break;

                case 'J' : case 'K': case 'L' :
                    count += 6;
                    break;

                case 'M' : case 'N': case 'O' :
                    count += 7;
                    break;

                case 'P' : case 'Q': case 'R' : case 'S' :
                    count += 8;
                    break;

                case 'T' : case 'U': case 'V' :
                    count += 9;
                    break;

                case 'W' : case 'X': case 'Y' : case 'Z' :
                    count += 10;
                    break;
            }
        }
        System.out.println(count);
    }
}
