package knu.algorizm;

import java.util.*;

public class p2910 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 숫자의 개수

        // 숫자 입력 순서대로 저장
        List<Integer> input = new ArrayList<>();

        // 숫자별 등장 횟수 저장
        Map<Integer, Integer> freqMap = new HashMap<>();     //**"숫자 ➝ 빈도 수"**를 저장하기 위한 자료구조를 만드는 코드입니다.
        /*
        key, value로 ~~
         */


        // 숫자별 처음 등장한 인덱스 저장
        Map<Integer, Integer> orderMap = new HashMap<>();

        // 입력 받으면서 처리
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            input.add(num); // 순서대로 저장

            // 빈도 수 세기
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

            // 처음 나온 숫자면 순서 저장
            if (!orderMap.containsKey(num)) {   // 처음 등장한 인덱스 기록
                orderMap.put(num, i);
            }
        }

            /*
            orderMap : 숫자 -> 처음 등장한 위치 저장
            containsKey(num) : 숫자가 맵에 들어있나 확인
            !containKey(num) : 처음 나온 숫자라면 / put(num,i) : 현재위치 i를 저장
             */

        // 중복 제거된 숫자 목록을 리스트로 만듦 (정렬용)
        List<Integer> uniqueNums = new ArrayList<>(freqMap.keySet());

        // 정렬 기준 설정
        Collections.sort(uniqueNums, (a, b) -> {
            // 1. 빈도 내림차순
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);

            if (freqA != freqB) {
                return freqB - freqA; // 더 많이 나온 숫자가 앞으로
            }

            // 2. 등장 순서 오름차순
            return orderMap.get(a) - orderMap.get(b);
        });

        // 결과 출력: 정렬된 숫자들을 각각 빈도만큼 출력
        for (int num : uniqueNums) {     // uniqueNums 리스트에 있는 각 숫자(num)를 하나씩 꺼내서 반복한다.
            int count = freqMap.get(num);
            for (int i = 0; i < count; i++) {
                System.out.print(num + " ");
            }
        }
    }
}
