// 25.07.04

package solved.Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);
        int D = Integer.parseInt(br.readLine());

        int s = 0;
        int res = 0;

        s = C + (60*B) + (60*60*A);

        res = D + s;
        int H = (res/60)/60;
        int M = (res/60)%60;
        int S = res % 60;

        if (H>23){
            H = H%24;
        }

        System.out.println(H + " " + M + " " + S);

    }
}
