// 25.06.20

package solved.Bronze5;

import java.util.Scanner;

public class p2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long M = sc.nextInt();

        System.out.println(Math.abs(N - M));

    }
}


/*
문제에서 조건이
(-2,000,000,000 ≤ N, M ≤ 2,000,000,000)
이지만

각각 최대, 최소일떄 N-M의 절댓값이 int형이 아니기 떄문에
처음부터 long으로 설정해주어얗암.

 */