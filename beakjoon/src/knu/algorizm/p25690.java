package knu.algorizm;

import java.io.*;
import java.util.*;

public class p25690 {
    static int N;
    static List<Integer>[] graph;
    static long[][] dp;         // long 으로 변경
    static boolean[] visited;
    static long[] whiteCost, blackCost;  // long 으로 변경

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        graph = new ArrayList[N];
        for (int i = 0; i < N; i++) graph[i] = new ArrayList<>();
        dp = new long[N][2];
        visited = new boolean[N];
        whiteCost = new long[N];
        blackCost = new long[N];

        // 간선
        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        // 비용
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            whiteCost[i] = Long.parseLong(st.nextToken());
            blackCost[i] = Long.parseLong(st.nextToken());
        }

        dfs(0);
        System.out.println(Math.min(dp[0][0], dp[0][1]));
    }

    static void dfs(int node) {
        visited[node] = true;
        dp[node][0] = whiteCost[node];
        dp[node][1] = blackCost[node];

        for (int ch : graph[node]) {
            if (!visited[ch]) {
                dfs(ch);
                // 부모가 WHITE → 자식 자유롭게 (min)
                dp[node][0] += Math.min(dp[ch][0], dp[ch][1]);
                // 부모가 BLACK → 자식은 반드시 WHITE
                dp[node][1] += dp[ch][0];
            }
        }
    }
}
