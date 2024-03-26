package Java.Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baek11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int A;
        int B;
        StringTokenizer st;

        for(int i = 1; i <= T; i++){
            st = new StringTokenizer(br.readLine()," ");
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            int C = A+B;
            bw.write("Case #"+ i + ": ");
            bw.write(A + " + " + B + " = ");
            bw.write(C + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
