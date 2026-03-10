package beakjoonStep.step03;

import java.util.Scanner;

public class p2739 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int i=1;
        for (i=1; i<=9; i++) {
            System.out.println(A + " * " + i + " = " + A*i);

        }
    }
}



/*
=====문제점
너가 쓴 for문:
for {
    (i < 9)
    ...
}

X -> Java에서는 for 문법이 꼭 세 부분으로 나눠져 있어야 해:
for (초기식; 조건식; 증감식) {
    // 반복할 코드
}


=====고쳐야 할 부분
지금 i = 1;은 밖에 선언했으니까 써먹을 수는 있지만,
그럴 거면 while문이 더 어울려.

하지만 너가 for문으로 구구단 출력하고 싶다면 이렇게 쓰는 게 맞아:
for (int i = 1; i <= 9; i++) {
    System.out.println(A + " * " + i + " = " + (A * i));
}





======
요소 | for 문 | while 문
초기화 | 괄호 안에서 | 괄호 밖에서
조건식 | 괄호 안 | 괄호 안
증감 | 괄호 안에서 | 괄호 블록 안에서 직접 써야 함



===== while으로 쓰려면
int i = 1;
while (i <= 9) {
    // 반복할 내용
    i++;
}


 */