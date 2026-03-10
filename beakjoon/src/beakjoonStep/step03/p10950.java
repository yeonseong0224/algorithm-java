package beakjoonStep.step03;

// 구글링함!!
// 다시 풀어보기


import java.util.Scanner;

public class p10950 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();                   // 테스트 케이스 개수 입력받음
        int[] arr = new int[T];                 // T개짜리 배열 생성

        for (int i=0; i<T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            arr[i] = A + B;                     // 결과를 배열에 저장
        }

        for (int C :arr) {                      // 배열을 향상된 for문으로 순회
            System.out.println(C);
        }
    }
}



/*
===== 문제 요구사항 (정리)
1. 사용자로부터 몇 번 반복할지 (T) 입력받는다.
2. T번 반복하면서, 두 수 A, B를 입력받고
3. A + B를 출력한다 (한 줄씩)




====코드의 문법 오류부터 먼저!
int arr[] = new int;
-> 이건 에러야!
자바에서는 배열을 만들 때 크기를 반드시 지정하거나, 초기값을 넣어야 해.
지금은 new int만 썼고 크기를 안 줘서 오류 발생!
따라서
int arr[] = new int[T];
-> 배열 생성 시 크기 저장!



==== split() vs arr[]
둘 다 "배열"
-차이점 1
    차이      |           예시	         |           설명
split()	       "3 4".split(" ")	            문자열을 잘라서 배열 생성 (자동으로 String[])
new int[5]	    int[] arr = new int[5];	    배열을 직접 선언해서 숫자 저장 (int[])


 - 차이점 2
                 방식                  | 배열 타입
"1 2".split(" ") → ["1", "2"]         |   String[]
int[] arr = new int[5];               |  int[]

- 정리 요약
항목 | split() | arr[] = new int[...]
만드는 방식 | 문자열에서 자동 생성 | 직접 선언 (new)
반환 타입 | String[] | int[], double[] 등 타입 직접 지정
용도 | 문자열 나누기 | 숫자, 값 저장용 배열
자주 쓰는 곳 | 입력 파싱 (sc.nextLine().split()) | 데이터 저장, 반복처리 등


 */