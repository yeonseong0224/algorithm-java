package solved.Bronze4;

import java.util.Scanner;

public class p31688 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int K = in.nextInt();

        int P = M/N;
        int G = P*K;

        System.out.println(G);

    }
}
