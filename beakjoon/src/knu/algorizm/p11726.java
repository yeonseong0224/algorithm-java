package knu.algorizm;


import java.util.Scanner;

// 2 * n 타일링

public class p11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

            if (N <= 2) {
                System.out.println(N);
            } else {
                int[] dp = new int[N + 1];  // dp 배열 생성
                dp[1] = 1;
                dp[2] = 2;

                for (int i = 3; i <= N; i++) {
                    dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
                }
                System.out.print(dp[N]);
            }





    }
}
