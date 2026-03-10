package beakjoonStep.step02;

import java.util.Scanner;

public class p2480 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A==B && B==C )
            System.out.println(10000+(A*1000));
        else if (A==B)
            System.out.println(1000+(A*100));
        else if (A==C)
            System.out.println(1000+(A*100));
        else if (B==C)
            System.out.println(1000+(C*100));
        else
            System.out.println((Math.max(Math.max(A,B),C)*100));
        }
    }





/*
1. 잘못된 조건문 문법 (== 연결)
너 코드 중
if (A == B == C)
-> X Java에서는 ==을 연속으로 연결해서 쓰면 안 돼.
A == B && B == C 이렇게 써야 돼.
 */



/*
2. else는 단독 사용! 조건 붙이면 else if
너 코드 중:
else (A == B)
-> X  이건 문법 오류야. else는 조건 못 붙여.
조건 붙일 땐 항상 else if (조건) 써야 돼!
 */



/*
4. 다 다를 때 가장 큰 값 구하는 로직
너 지금 이걸 이렇게 쓰고 있어:
if (A > B > C)
-> X  Java에선 이거 안 돼.
A > B && B > C 처럼 명확히 써야 해.
근데 그것보다 더 간단한 거 있음 -> Math.max() 써!
int max = Math.max(A, Math.max(B, C));


Math.max()는 두 개만 비교할 수 있으니까 이렇게 중첩해야 해:
Math.max(Math.max(A, B), C)

 */