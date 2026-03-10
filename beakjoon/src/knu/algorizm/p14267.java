package knu.algorizm;

import java.util.*;

public class p14267 {
    static List<Integer>[] children;  // 부하 리스트
    static long[] praise;             // dp 배열 역할: 칭찬 누적 점수
    static int[] boss;                // 상사 정보 저장

    // DFS 재귀: cur(부모)의 praise 값을 자식에게 더해 주고 재귀 호출
    static void dfs(int cur) {
        for (int c : children[cur]) {
            praise[c] += praise[cur];
            dfs(c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 직원 수
        int M = sc.nextInt();  // 칭찬 기록 수

        // 1) 자료구조 초기화
        children = new ArrayList[N+1];
        boss     = new int[N+1];
        praise   = new long[N+1];
        for (int i = 1; i <= N; i++) {
            children[i] = new ArrayList<>();
        }

        // 2) 상사 정보 입력 → children 그래프 구성
        for (int i = 1; i <= N; i++) {
            boss[i] = sc.nextInt();
            if (boss[i] != -1) {
                children[boss[i]].add(i);
            }
        }

        // 3) 칭찬 기록 읽어서 praise[emp]에 누적
        for (int i = 0; i < M; i++) {
            int emp = sc.nextInt();
            int w   = sc.nextInt();
            praise[emp] += w;
        }

        // 4) 최고 관리자(root)부터 DFS 시작
        for (int i = 1; i <= N; i++) {
            if (boss[i] == -1) {
                dfs(i);
            }
        }

        // 5) 결과 출력
        for (int i = 1; i <= N; i++) {
            System.out.print(praise[i] + " ");
        }
        sc.close();
    }
}





/*
아주 쉽게 흐름 정리
1. 입력
N: 직원 수, M: 칭찬 기록 수
다음 줄에 각 직원의 상사 번호(boss)가 주어져요.
그다음 M줄엔 “emp w” 형태로, emp 직원이 w만큼 칭찬을 받았다고 기록돼 있어요.

2. 초기화
children[i] 에 i의 모든 부하를 담을 빈 리스트를 만들고
praise[i] 에는 i가 받은 칭찬 점수를 저장할 공간을 준비해요.

3. 부하(트리) 만들기
boss[i]가 -1이 아니면, boss[i]의 부하 목록에 i를 추가해요.
이렇게 하면 “상사 → 부하” 연결이 완성됩니다.

4. 칭찬 점수 채우기
입력에서 받은 대로 praise[emp] += w 해 두면, 처음 받는 칭찬 점수가 저장돼요.

5. DFS로 칭찬 전파
최고 관리자를 찾고(상사 번호가 -1인 사람), dfs(root)를 호출해요.
dfs(cur)는 cur가 받은 점수를
cur의 부하 c에게 더해 주고,
다시 dfs(c)를 호출해서 아래로 똑같이 전파합니다.

6. 출력
1번부터 N번까지 praise[i]를 순서대로 공백으로 구분해 출력하면 끝!
 */
