package knu.algorizm;

import java.util.Scanner;

public class p5557 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] nums = new int[N];

        for (int i=0; i<N; i++) {
            nums[i]=sc.nextInt();
        }

        long[][] dp = new long[N-1][21];

        dp[0][nums[0]] =1;

        for (int i=1; i<=N-2; i++){
            int cur = nums[i];
            for (int prev =0; prev <= 20; prev++) {
                if (dp[i-1][prev] > 0) {
                    int plus = prev+cur;
                    if (plus <= 20) {
                        dp[i][plus] += dp[i-1][prev];
                    }

                    int minus = prev-cur;
                    if (minus >= 0){
                        dp[i][minus] += dp[i-1][prev];
                    }
                }
            }
        }

        int target = nums[N-1];
        System.out.println(dp[N-2][target]);
    }
}
