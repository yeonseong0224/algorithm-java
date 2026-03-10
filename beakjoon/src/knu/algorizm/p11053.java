package knu.algorizm;

import java.util.Scanner;

public class p11053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] A = new int[N];
        // 정수 배열 A를 N개의 길이로 만든다.
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int [] dp = new int[N];
        for (int i = 0; i < N; i++) {
            dp[i] = 1;  // 최소 길이 1
        }

        // LIS 알고리즘
        // LIS DP 로직 (O(N²))
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            if (dp[i] > max) {
                max = dp[i];
            }
        }

        System.out.println(max);
    }
}


/*

1. 정의
LIS는 어떤 수열이 주어졌을 때,
원소들의 순서를 바꾸지 않고 일부 원소를 골라 만든
가장 긴 strictly 증가하는 부분 수열을 말합니다.
 */

/*
2. 핵심 아이디어
LIS를 구하는 대표적인 방법은 두 가지입니다:
* 방법 1: DP (O(N²)) - 가장 기본적
dp[i]: i번째 원소를 마지막 원소로 하는 LIS의 길이
초기값: dp[i] = 1 (자기 자신만 포함할 때)
점화식:
dp[i] = max(dp[j] + 1) for all j < i and A[j] < A[i]
즉, A[i]보다 작은 값이 앞에 있으면 그것을 이어붙이는 방식.
* 방법 2: 이진 탐색을 활용한 O(N log N) 방식
 */


/*
목적:
각 i에 대해 dp[i]는 A[i]를 끝으로 하는 가장 긴 증가 부분 수열의 길이를 저장합니다.

🔁 바깥 루프: for (int i = 0; i < N; i++)
현재 위치 i를 기준으로,
A[0] ~ A[i-1] 중 A[i]보다 작은 수들을 찾아서
그 수열을 이어붙일 수 있는지 확인하려는 겁니다.

🔁 안쪽 루프: for (int j = 0; j < i; j++)
i보다 앞에 있는 원소 j들을 모두 탐색하면서,

A[j] < A[i]이면: 증가하는 수열 조건을 만족하는 것.

🧠 조건문 설명:+
if (A[j] < A[i] && dp[i] < dp[j] + 1)
📌 A[j] < A[i]
A[i]를 A[j] 뒤에 붙일 수 있는가? → 증가 수열 조건 체크.

📌 dp[i] < dp[j] + 1
기존 dp[i]보다,
dp[j]에서 A[i]를 추가한 길이(dp[j]+1)가 더 크다면
→ dp[i]를 그 값으로 갱신.

✅ 즉, 의미는:
A[j] < A[i]인 수열이 존재하고
그 수열이 A[i]로 끝나는 길이를 늘릴 수 있으면
dp[i]를 dp[j] + 1로 업데이트하라
 */