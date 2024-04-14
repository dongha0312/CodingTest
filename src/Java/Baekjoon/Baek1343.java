package Java.Baekjoon;


import java.util.Scanner;

public class Baek1343 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String res = "";
        res = poliominos(s);
        System.out.println(res);
    }

    public static String poliominos(String s){
        String ans = "";
        String A = "AAAA", B = "BB";
        s= s.replaceAll("XXXX", A);
        ans = s.replaceAll("XX", B);

        if (ans.contains("X")) {
            ans ="-1";
        }
        return ans;
    }
}
