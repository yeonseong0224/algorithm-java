package solved.Bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class p3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String[] parts = line.split(" ");

        int[] white = new int[6];

        for (int i = 0; i < 6; i++) {
            white[i] = Integer.parseInt(parts[i]);
        }

        int[] black = {1,1,2,2,2,8};

        int [] result = IntStream.range(0, 6)
                .map(j ->black[j] - white[j])
                .toArray();

        System.out.println(result);

    }
}
