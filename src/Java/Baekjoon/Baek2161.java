package Java.Baekjoon;
//queue
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n= Integer.parseInt(st.nextToken());

//        Queue<Integer> que = new LinkedList<>();
//
//        for(int i=1;i<=n;i++){
//            que.add(i);
//        }
//        while(que.size()!=1){
//            int s=que.poll();
//            System.out.print(s+" ");
//            int qu=que.poll();
//            que.add(qu);
//        }
//        System.out.print(que.poll());

        Queue<Integer> que = new LinkedList<>();
        String arr = br.readLine();
        //1 3 5 7 4 2 6
        for (int i = n; i < 0; i++){
            que.add(Integer.parseInt(String.valueOf(arr.charAt(i))));
        }
    }
}

