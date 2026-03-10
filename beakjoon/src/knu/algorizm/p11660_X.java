package knu.algorizm;

// 이렇게 하면 시간 초과 뜸

import java.util.Scanner;

public class p11660_X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 변수 선언
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [][] matrix = new int[N][N];


        // N*N 행렬 입력 받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // M번 반복해서 합 구하기
        for (int k = 0; k < M; k++) {
            int x1 = sc.nextInt(); int y1 = sc.nextInt();
            int x2 = sc.nextInt(); int y2 = sc.nextInt();
            int sum = 0;
            for (int i = x1-1; i<x2; i++){
                for (int j = y1-1; j<y2; j++){
                    sum += matrix[i][j];
                }
            }

            System.out.println(sum);
        }



    }
}
