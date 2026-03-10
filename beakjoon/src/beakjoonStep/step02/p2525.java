package beakjoonStep.step02;

import java.util.Scanner;

public class p2525 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int D = ((A * 60) + B) + C; // 1
        int H = D / 60;
        if (H>=24)
            H = H-24;  // 2
        int M = D % 60;

        System.out.println(H + " " + M);
    }
}

/* 1
 int D = {(A*60)+B}+C;
 자바에서 {}중관호는 블록,배열 초기화에서만 쓰기 때문에 오류남.
 */

/* 2
if (H>=24)
    H-24;
H-24만 있으면 아무 일도 안 일어남.
따라서 결과를 저장해야함.
 */