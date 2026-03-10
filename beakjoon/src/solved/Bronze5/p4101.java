package solved.Bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p4101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] input = br.readLine().split(" "); // 공백 기준으로 나눔
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            if (A == 0 && B == 0) {
            break;
        }

        if (A > B) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        }
    }
}
