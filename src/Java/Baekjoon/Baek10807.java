package Java.Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baek10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int find = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == find){
                count++;
            }
        }
        bw.write(count + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
