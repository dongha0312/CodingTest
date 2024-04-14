package Java.Baekjoon;

import java.util.Scanner;

public class Baek5613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        while(true){
            String divider = sc.nextLine();
            if(divider.equals("="))break;

            switch (divider){
                case "+":
                    num+= sc.nextInt();
                    break;

                case "-":
                    num-=sc.nextInt();
                    break;

                case "/":
                    num /= sc.nextInt();
                    break;

                case "*":
                    num *= sc.nextInt();
                    break;

                default:
                    break;
            }
        }
        System.out.println(num);
    }
}
