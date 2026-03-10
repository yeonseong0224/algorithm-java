package beakjoonStep.KNU;

import java.util.*;

public class p09375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // 테스트 케이스 개수

        while (t-- > 0) {
            int n = sc.nextInt();  // 의상 수
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String name = sc.next();   // 의상 이름 (사용 안 함)
                String type = sc.next();   // 의상 종류

                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            int answer = 1;
            for (int count : map.values()) {
                answer *= (count + 1);  // 해당 종류에서 안 입는 경우 포함
            }

            System.out.println(answer - 1);  // 전부 안 입는 경우 제외
        }

        sc.close();
    }
}
