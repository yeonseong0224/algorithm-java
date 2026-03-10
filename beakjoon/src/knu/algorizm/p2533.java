package knu.algorizm;

import java.io.*;
import java.util.*;

public class p2533 {
    static final int Ea = 0;  // 얼리어답터
    static final int Ge = 1;  // 일반

    static List<Integer>[] graph;
    static boolean[] visited;
    // dp[state][i]: i번 노드가 state일 때(==Ea or Ge)
    //              i를 루트로 하는 부분 트리에서 필요한 얼리어답터 수 최솟값
    static int[][] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        visited = new boolean[N + 1];
        dp = new int[2][N + 1];

        dfs(1);

        // 루트(1번)가 Ea일 때 vs Ge일 때 중 최소
        System.out.println(Math.min(dp[Ea][1], dp[Ge][1]));
    }

    private static void dfs(int node) {
        visited[node] = true;
        // 초기값 설정
        dp[Ea][node] = 1;  // node가 얼리어답터면 자기 자신 포함
        dp[Ge][node] = 0;  // node가 일반이면 자기 자신은 세지 않음

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
                // node가 얼리어답터(Ea)면, 자식은 Ea or Ge 둘 다 가능 → 최소값
                dp[Ea][node] += Math.min(dp[Ea][next], dp[Ge][next]);
                // node가 일반(Ge)이면, 자식은 반드시 얼리어답터(Ea)여야 함
                dp[Ge][node] += dp[Ea][next];
            }
        }
    }
}


/*
1. 문제 핵심
여러분이 가진 소셜 네트워크는 트리 구조(사이클 없는 그래프)입니다.
각 사람(노드)은 ‘얼리어답터’가 되거나 일반(얼리어답터 아님)이 될 수 있어요.
조건: 일반 사람은 친구(인접 노드) 중 최소 한 명이라도 얼리어답터여야 합니다.
목표는 전체 네트워크를 커버하면서 얼리어답터 수를 최소로 하는 것.

2. DP 상태 정의
dp[0][i] = i번 노드가 얼리어답터일 때, i번 노드가 루트인 부분 트리에서 필요한 얼리어답터 수 최소값
dp[1][i] = i번 노드가 일반일 때, i번 노드가 루트인 부분 트리에서 필요한 얼리어답터 수 최소값
초기값 (Leaf 노드일 때)
얼리어답터면 자기 자신 1명 → dp[0][i] = 1
일반이면 자기 자신 0명 → dp[1][i] = 0

3. 점화식 (트리 DP)
어떤 노드 i에 대해, 자식 노드 v를 하나씩 처리한다고 가정하면:
i가 얼리어답터(dp[0][i]):
자식 v는 얼리어답터이든 아니든 상관없으니
dp[0][i] += min(dp[0][v], dp[1][v])
i가 일반(dp[1][i]):
자식 v는 반드시 얼리어답터여야 하므로
dp[1][i] += dp[0][v]

4. 구현 순서
그래프(인접 리스트)와 visited, dp 배열을 준비
1번 노드를 루트로 DFS를 타고 내려가면서, 위의 점화식대로 dp 값을 채움
마지막에 루트(1번)가 얼리어답터일 때와 아닐 때 중 더 작은 값을 출력
 */

