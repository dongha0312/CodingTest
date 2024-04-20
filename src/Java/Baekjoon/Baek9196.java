package Java.Baekjoon;

import java.util.Scanner;

public class Baek9196 {
    static int inH, inW, outH, outW;
    static void solve(){
        if(inW ==0 && inH == 0);
        int inDiagnal = inH*inH + inW*inW;

        outH = outW = 200;
        int outDiag = outH*outH + outW*outW;

        for(int h = 1; h < 150; h++){
            for(int w = h+1; w <= 150; w++){
                int diag = h*h + w*w;
                if(inH == h && inW == w)continue; // *자기자신 제외*
                if(diag < inDiagnal) continue;
                if((diag == inDiagnal) && (h < inH)) continue;

                if((diag < outDiag) || ((diag == outDiag) && (h < outH))){ //자기보다 큰 수 중에서 제일 작은거
                    outH = h;
                    outW = w;
                    outDiag = diag;
                }
            }
        }
        System.out.println(outH+" "+ outW);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            inH = sc.nextInt();
            inW = sc.nextInt();
            solve();
        }
    }

}
