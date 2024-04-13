package Java.Baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek5575 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i= 0; i < 3; i++){
            int arrivalTime = 0;
            int endTime = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++){
                int h = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                int s = Integer.parseInt(st.nextToken());
                if(j == 0) {
                    arrivalTime = (h * 3600) + (m * 60) + s;
                }else {
                    endTime = (h * 3600) + (m * 60) + s;
                }
            }
            endTime -= arrivalTime;

            System.out.println(endTime/3600 + " " + (endTime%3600)/60+" "+(endTime%3600)%60);
        }

    }
}
