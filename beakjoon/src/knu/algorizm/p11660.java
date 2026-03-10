import java.io.*;
import java.util.*;

public class p11660 {
    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받기 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫 줄에서 N(행렬 크기)과 M(쿼리 수)을 입력받음
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 행렬과 누적합 배열을 1-based 인덱스로 사용하기 위해 크기를 N+1로 설정
        int[][] matrix = new int[N + 1][N + 1];
        int[][] prefixSum = new int[N + 1][N + 1];

        // 행렬 입력 받기
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
                // 누적합 계산
                prefixSum[i][j] = prefixSum[i - 1][j] + prefixSum[i][j - 1]
                        - prefixSum[i - 1][j - 1] + matrix[i][j];
            }
        }

        // 결과 출력을 위한 StringBuilder
        StringBuilder sb = new StringBuilder();

        // M개의 쿼리 처리
        for (int q = 0; q < M; q++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            // 쿼리 영역의 합 계산
            int result = prefixSum[x2][y2] - prefixSum[x1 - 1][y2]
                    - prefixSum[x2][y1 - 1] + prefixSum[x1 - 1][y1 - 1];

            // 결과 저장
            sb.append(result).append("\n");
        }

        // 결과 출력
        System.out.print(sb.toString());
    }
}




/*
전체 흐름 (힌트 순서대로 요약)
1. matrix[i][j]에 입력 저장 (1-based index)
2. sum[i][j] = 위 + 왼쪽 - 대각선 + 자기자신 공식으로 누적합 배열 계산
3. 쿼리마다 위에 준 공식으로 결과 계산해서 출력
 */