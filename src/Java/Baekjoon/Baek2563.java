package Java.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*for-loop을 이용해서 색종이 N개를 입력받는다.
그리고 색종이의 왼쪽 변의 점 x, y가 주어지면 (x, y)부터 (x + 9, y + 9)까지 색종이가 붙어져 있다는 것을 의미한다.
따라서 이중 for-loop을 이용해 arr [x][y]부터 arr [x+9][y+9]를 true로 시켜준다.
그리고 맨 마지막에 true인 개수를 출력하면 된다.*/

public class Baek2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;  //검은 영역의 넓이
        int n = Integer.parseInt(br.readLine());  //색종이 개수
        boolean[][] arr = new boolean[101][101];  //도화지

        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            //(x,y)부터 (x+9, y+9)까지의 영역을 하나씩 체크한 후 총 넓이에 더해준다
            for (int j = x; j < x+10; j++){
                for (int k = y; k < y+10; k++){
                  if (!arr[j][k]){
                      arr[j][k] = true;
                      total++;
                  }
                }
            }
        }
        System.out.println(total);
    }
}
