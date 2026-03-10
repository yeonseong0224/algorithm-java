package beakjoonStep.KNU;

import java.io.*;
import java.util.*;

public class p1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // Solve
        HashMap<String, String> map = new HashMap<>();

        for (int no = 1; no <= N; ++no) {
            String name = br.readLine();
            map.put(name, String.valueOf(no));
            map.put(String.valueOf(no), name);
        }
        while (M-- > 0) {
            sb.append(map.get(br.readLine())).append('\n');
        }

        // Output
        System.out.println(sb);
    }
}