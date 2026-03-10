package solved.Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        int J = Integer.parseInt(br.readLine());
        int H = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());

        int burger = Math.min(Math.min(S, J), H);

        int Kset = burger + K;
        int Pset = burger + P;

        int set = Math.min(Pset, Kset) - 50 ;

        System.out.println(set);
    }
}
