package Java.Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baek10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");


        int maxValue = -1000001;
        int minValue = 1000001;

        for(int i = 0; i < N; i++){
            int value = Integer.parseInt(st.nextToken());

            if(value < minValue){
                minValue = value;
            }
            if(value > maxValue){
                maxValue = value;
            }
        }
        bw.write(minValue + " " + maxValue);
        br.close();
        bw.flush();
        bw.close();
    }
}
