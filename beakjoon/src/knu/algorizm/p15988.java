package knu.algorizm;

import java.util.Scanner;

public class p15988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] dp = new long[1000001];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= 1000000; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1000000009;
        }

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }

        sc.close();
    }
}
