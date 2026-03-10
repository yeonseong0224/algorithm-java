//package knu.algorizm;
//
//import java.io.*;
//import java.util.*;
//
//class Node {
//    int w, v;
//    Node(int w, int v) {
//        this.w = w;
//        this.v = v;
//    }
//}
//
//public class p11779 {
//    private static int[] dijkstra(int start, List<Node>[] graph) {
//        int[] dist = new int[graph.length];
//        Arrays.fill(dist, Integer.MAX_VALUE);
//        dist[start] = 0;
//
//        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.w));
//        pq.add(new Node(0, start));
//
//        while (!pq.isEmpty()) {
//            Node cur = pq.poll();
//            if (dist[cur.v] < cur.w)
//                continue;
//            for (Node next : graph[cur.v]) {
//                final int nw = cur.w + next.w;
//                if (nw < dist[next.v]) {
//                    dist[next.v] = nw;
//                    pq.add(new Node(nw, next.v));
//                }
//            }
//        }
//        return dist;
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        // Input
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        final int V = Integer.parseInt(st.nextToken());
//        final int E = Integer.parseInt(st.nextToken());
//        final int START = Integer.parseInt(br.readLine());
//
//        List<Node>[] graph = new ArrayList[V + 1];
//        for (int i = 1; i <= V; ++i) {
//            graph[i] = new ArrayList<>();
//        }
//        for (int i = 0; i < E; ++i) {
//            st = new StringTokenizer(br.readLine());
//            final int u = Integer.parseInt(st.nextToken());
//            final int v = Integer.parseInt(st.nextToken());
//            final int w = Integer.parseInt(st.nextToken());
//            graph[u].add(new Node(w, v));
//        }
//        // Solve
//        int[] dist = dijkstra(START, graph);
//
//        // Output
//        for (int i = 1; i <= V; ++i) {
//            sb.append(dist[i] != Integer.MAX_VALUE ? dist[i] : "INF").append("\n");
//        }
//        System.out.println(sb);
//    }
//}