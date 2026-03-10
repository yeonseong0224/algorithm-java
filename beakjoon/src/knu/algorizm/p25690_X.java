package knu.algorizm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p25690_X {
    static final int WHITE = 0;
    static final int BLACK = 1;

    // 각 노드의 색칠 비용을 저장하는 배열
    // price[node][color] = 해당 노드를 color 로 칠하는 데 드는 비용
    static int[][] price;

    // 각 노드의 상태별 최소 비용을 저장하는 DP 배열
    static int[][] dp;

    // 이미 방문했는지 확인하는 배열 (DFS에서 필요)
    static boolean[] visited;

    // 트리 구조를 저장하는 리스트 배열
    // 여러 개의 연결 리스트를 배열에 넣은 구조
    static List<Integer>[] tree;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 노드 개수

        // 배열 초기화
        price = new int[n + 1][2]; // 1번 노드부터 사용, 색은 2개 (W,B)
        dp = new int[n + 1][2];
        visited = new boolean[n + 1];
        tree = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) { // ✅ 0까지 초기화
            tree[i] = new ArrayList<>();
        }

        // 트리의 간선 정보 입력
        for (int i = 1; i <= n - 1; i++) { // 간선은 항상 n - 1개
            int u = sc.nextInt(); // 연결
            int v = sc.nextInt();
            tree[u].add(v); // 양방향 연결 (트리이기때문)
            tree[v].add(u);
        }

        // 각 노드의 색칠 비용 입력
        for (int i = 1; i <= n; i++) {
            price[i][WHITE] = sc.nextInt(); // i번 노드를 WHITE로 칠할 때의 비용
            price[i][BLACK] = sc.nextInt();
        }

        // DFS로 트리를 탐색하여 dp채우기
        dfs(1); // 루트 노드는 1번이라고 가정

        // 루트 노드를 WHITE로 칠할때와 BLACK으로 칠할 때 더 싼 비용 출력
        System.out.println(Math.min(dp[1][WHITE], dp[1][BLACK]));
    }

    // DFS로 트리를 탐색하며 dp배열 채우는 함수
    static void dfs(int node) {
        visited[node] = true; // 방문 표시

        // 현재 노드를 WHITE 또는 BLACK으로 칠할 때의 기본 비용 설정
        dp[node][WHITE] = price[node][WHITE]; // 그냥 자기 자신만 칠한 비용
        dp[node][BLACK] = price[node][BLACK];

        int extra = Integer.MAX_VALUE; // WHITE일 때 자식 중 하나는 반드시 WHITE가 되어야 하므로 추가 보정 비용 계산용

        // 현재 노드의 자식 노드들을 순회
        for (int child : tree[node]) {
            if (!visited[child]) {
                dfs(child); // 자식 먼저 처리 (후위 탐색) dfs..?

                // 자식 노드까지 모두 계산된 상태에서, 내 dp를 갱신
                // 내가 WHITE면, 자식은 W,B 아무거나 ㄱㄴ
                dp[node][WHITE] += Math.min(dp[child][WHITE], dp[child][BLACK]);

                // 내가 BLACK 이면 자식은 반드시 WHITE
                dp[node][BLACK] += dp[child][WHITE];

                // 보정용: 자식이 BLACK일 경우를 선택했을 때와 WHITE일 때의 차이 중 최소값
                // (자식 하나는 무조건 WHITE로 바꿔야 하니까 그 보정 비용을 계산)
                int diff = dp[child][WHITE] - Math.min(dp[child][WHITE], dp[child][BLACK]);
                extra = Math.min(extra, diff);
            }
        }

        // WHITE인 경우 모든 자식이 BLACK이 되는 것을 방지하기 위해 보정 비용 추가
        // (자식이 하나도 없으면 추가하지 않음)
        if (tree[node].size() > 1 || node != 1) {
            if (extra != Integer.MAX_VALUE) {
                dp[node][WHITE] += extra;
            }
        }
    }
}
