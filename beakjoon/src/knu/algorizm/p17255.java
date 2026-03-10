package knu.algorizm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class p17255 {

    static Set<String> resultSet = new HashSet<>();
        static String input;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            input = sc.next();

            boolean[] visited = new boolean[input.length()];
            dfs("", visited, "");
            System.out.println(resultSet.size());
        }

        static void dfs(String current, boolean[] visited, String trace) {
            if (!trace.isEmpty()) {
                resultSet.add(trace);
            }

            for (int i = 0; i < input.length(); i++) {
                if (visited[i]) continue;

                visited[i] = true;

                // 왼쪽에 붙이기
                dfs(input.charAt(i) + current, visited, input.charAt(i) + trace);

                // 오른쪽에 붙이기
                dfs(current + input.charAt(i), visited, trace + input.charAt(i));

                visited[i] = false;
            }
        }
    }




/*
팩토리얼로 풀 수 없음
 어떻게 숫자를 조합해서 문자열을 만들 수 있느냐. 가 관건
 문제에서도 한 자리씩 숫자를 양쪽에 붙여가며 만들 수 있어야 함.

 -> 1주차 백트래킹 이용 : 근데 이해 정확하게 못함 여튼

 */