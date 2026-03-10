package knu.algorizm;

// 피보나치 함수
// 다시 풀어보기

import java.util.Scanner;

public class p1003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[][]dp=new int[41][2];
        dp[0][0]=1;
        dp[0][1]=0;
        dp[1][0]=0;
        dp[1][1]=1;

        for (int i=2;i<=40;i++){
            dp[i][0]=dp[i-1][0]+dp[i-2][0];
            dp[i][1]=dp[i-1][1]+dp[i-2][1];
        }

        int T=sc.nextInt();

        for (int i=0;i<T;i++){
            int N = sc.nextInt();
            System.out.println(dp[N][0]+" "+dp[N][1]);
        }

    }
}
