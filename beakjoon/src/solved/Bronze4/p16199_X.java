package solved.Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p16199_X {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] N = br.readLine().split(" ");
        int A = Integer.parseInt(N[0]);
        int B = Integer.parseInt(N[1]);
        int C = Integer.parseInt(N[2]);

        String[] T = br.readLine().split(" ");
        int D = Integer.parseInt(T[0]);
        int E = Integer.parseInt(T[1]);
        int F = Integer.parseInt(T[2]);

        int man = D-A;
        if (E<B || (E == B && F<C)) {
            man--;
        }

        int count = D-A +1;

        int year = D-A;



        System.out.println(man);
        System.out.println(count);
        System.out.println(year);



    }
}
