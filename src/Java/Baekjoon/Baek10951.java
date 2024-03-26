package Java.Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baek10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        String str;

        while((str = br.readLine()) != null){
            st = new StringTokenizer(str," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write((A+B)+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
