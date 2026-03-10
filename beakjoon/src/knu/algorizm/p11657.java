package knu.algorizm;

import java.io.*;
import java.util.*;

public class p11657 {
    static class Edge {
        int from, to;
        long weight;

        Edge(int u, int v, int w) {
            this.from = u;
            this.to = v;
            this.weight = w;
        }
    }

    static final long INF = Long.MAX_VALUE / 2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Edge[] edges = new Edge[M];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            edges[i] = new Edge(A, B, C);  // 간선 추가
        }

        long[] dist = bellmanFord(1, N, edges);
        if (dist == null) {
            System.out.println(-1);
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 2; i <= N; i++) {
                sb.append(dist[i] == INF ? -1 : dist[i]).append('\n');
            }
            System.out.print(sb);
        }
    }

    static long[] bellmanFord(int start, int V, Edge[] edges) {
        long[] dist = new long[V + 1];
        Arrays.fill(dist, INF);
        dist[start] = 0;

        for (int i = 1; i <= V - 1; i++) {
            boolean updated = false;
            for (Edge e : edges) {
                if (dist[e.from] != INF && dist[e.to] > dist[e.from] + e.weight) {
                    dist[e.to] = dist[e.from] + e.weight;
                    updated = true;
                }
            }
            if (!updated) break;
        }

        for (Edge e : edges) {
            if (dist[e.from] != INF && dist[e.to] > dist[e.from] + e.weight) {
                return null; // 음수 사이클 존재
            }
        }

        return dist;
    }
}
