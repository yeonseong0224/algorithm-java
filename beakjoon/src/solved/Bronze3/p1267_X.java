package solved.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1267_X {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int Y = 0;
        int M = 0;

        String[] s = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            int time = Integer.parseInt(s[i]);

            Y += ((time/30)+1)*10;
            M += ((time/60)+1)*15;
        }
        if (Y<M){
            System.out.println("Y "+Y);
        } else if (Y>M){
            System.out.println("M "+M);
        } else {
            System.out.println("Y M "+ Y);
        }

    }
}