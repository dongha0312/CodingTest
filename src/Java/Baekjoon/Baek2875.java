package Java.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2875 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  //여학생
        int M = Integer.parseInt(st.nextToken());  //남
        int K = Integer.parseInt(st.nextToken());  //인턴십
        int answer =0;

        // 2명의 여학생과 1명의 남학생이 팀을 결성
        // 현재 여학생이 2명 이상이고 남학생이 1명 이상이여서 한팀을 결성할 수 있다
        // 이때 팀을 결성하면 총 인원에서 3명이 빠지고 또한 K명을 또 빼야한다
        // 즉, 총 인원에서 K명을 인턴에 보내고 나머지 인원들 중
        // 3명으로 팀을 만들 수 있는지 확인

        while (N >= 2 && M >= 1 && (N + M) - K >= 3) {
            answer++;
            N -= 2;
            M--;
        }
        System.out.println(answer);
    }
}
