package knu.algorizm;

import java.util.Arrays;
import java.util.Scanner;

public class p11722 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] M = new int [N];
        for (int i = 0; i < N; i++) {
            M [i] = sc.nextInt();
        }

        int[] dp = new int[N];
        Arrays.fill(dp, 1);

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (M[j] > M[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int res = 0;
        for (int i = 0 ; i < N; i++) {
            res = Math.max(res, dp[i]);
        }
        System.out.println(res);

    }
}
