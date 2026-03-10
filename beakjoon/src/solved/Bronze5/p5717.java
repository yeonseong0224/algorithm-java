package solved.Bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5717 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String[] input = br.readLine().split(" ");
            int M = Integer.parseInt(input[0]);
            int F = Integer.parseInt(input[1]);

            if (M == 0 && F == 0)
                break;

            System.out.println(M+F);
        }

    }


}
