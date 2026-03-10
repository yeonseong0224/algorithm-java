// gpt가 풀음 ,,,;;;; 에바띠

package solved.Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {           // i: 현재 줄 번호
            for (int j = 1; j <= N - i; j++) {   // j: 공백 출력
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {       // k: 별 출력
                System.out.print("*");
            }
            System.out.println();               // 줄바꿈
        }
    }
}
