package solved.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2490_X {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 0; t < 3; t++) {
            String[] S = br.readLine().split(" ");
            int zero = 0;
            int one = 0;

            for (int i = 0; i < S.length; i++) {
                int count = Integer.parseInt(S[i]);
                if (count == 0) zero++;
                else if (count == 1) one++;
            }

            if (zero ==1 && one ==3){
                System.out.println("A");
            } else if (zero ==2 && one ==2){
                System.out.println("B");
            } else if (zero ==3 && one ==1){
                System.out.println("C");
            } else if (zero == 4){
                System.out.println("D");
            } else {
                System.out.println("E");
            }
        }





    }
}
