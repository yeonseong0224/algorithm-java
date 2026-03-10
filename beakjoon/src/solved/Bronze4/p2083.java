package solved.Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            String[] parts = line.split(" ");
            if (parts[0].equals("#")) break;

            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            int weight = Integer.parseInt(parts[2]);

            if (age >= 18 || weight >= 80) {
                System.out.println(name + " Senior");
            }
            else {
                System.out.println(name + " Junior");
            }

        }
    }
}
