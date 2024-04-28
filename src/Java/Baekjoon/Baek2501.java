package Java.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baek2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

//         ex. 6 3 (1,2,3,6)  ans:3
//        N의 약수들 중에 K번째로 작은 수
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int [] arr = new int[N];
        List<Integer> result = new ArrayList<>();

//        for(int i = 0; i < N; i++) {
//            if (N % (i + 1) == 0) {
//                arr[i] = N / (i + 1);
//            }
//            if(arr[i]!=0){
//                result.add(arr[i]);
//            }
//        }
//        Collections.reverse(result);

        for(int i = 1; i <= N; i++){
            if (N%i == 0){
                result.add(i);
            }
        }

        System.out.println(result);
        if(result.size() <= K-1){
            System.out.println("0");
        }
        else System.out.println(result.get(K-1));

    }
}
