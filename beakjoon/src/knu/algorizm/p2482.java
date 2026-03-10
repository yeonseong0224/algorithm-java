package knu.algorizm;

import java.util.Scanner;

public class p2482 {
    static final int MOD = 1000000003;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        if (K > N / 2) {
            System.out.println(0);
            return;
        }

        long[][] dp = new long[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {
            dp[i][0] = 1;
            dp[i][1] = i;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 2; j <= K; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i - 2][j - 1]) % MOD;
            }
        }

        long result = (dp[N - 3][K - 1] + dp[N - 1][K]) % MOD;
        System.out.println(result);
    }
}
