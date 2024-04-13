package Java.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int totPpl = L*P;
        int [] arr = new int[5];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
            if(arr[i] > totPpl){
                System.out.print(arr[i]-totPpl +" ");
            }
            if (arr[i]<= totPpl){
                System.out.print(arr[i] - totPpl+" ");
            }
         }
    }
}
