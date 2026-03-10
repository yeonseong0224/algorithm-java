package beakjoonStep.step03;

// 다시 풀어보기

import java.util.Scanner;

public class P25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long X = sc.nextLong();
        int N = sc.nextInt();
        long total = 0;

        for (int i = 0; i < N; i++) {
            long a = sc.nextLong();
            int b = sc.nextInt();
            total += a*b;
        }


        if (X == total)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}




/*
double : 소수점
long : 큰 숫자
 */

/*
✨ 한줄 요약
소수점 (double) 절대 쓰지 말고, long 써야 함

총합을 계산해야지, 각 물건 값을 배열에 저장할 필요는 없음

C (total)은 for문 바깥에서 누적해서 마지막에 비교
 */


/*
total = total + (a * b);
의 축약형
total += a * b;


 */