package solved.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1547_X {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 공은 처음에 1번 컵에 들어있음
        int ball = 1;

        // 교환 횟수 입력
        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String[] s = br.readLine().split(" ");
            int X = Integer.parseInt(s[0]); // 교환할 첫 번째 컵 번호
            int Y = Integer.parseInt(s[1]); // 교환할 두 번째 컵 번호

            // 만약 공이 X 컵에 있었다면 → Y로 이동
            if (ball == X) {
                ball = Y;
            }
            // 만약 공이 Y 컵에 있었다면 → X로 이동
            else if (ball == Y) {
                ball = X;
            }
            // 공이 다른 컵에 있으면 아무 변화 없음
        }

        // 최종적으로 공이 들어 있는 컵 번호 출력
        System.out.println(ball);
    }
}



//package solved.Bronze3;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class p1547 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int[] arr = {1, 2, 3};
//
//        int M = Integer.parseInt(br.readLine());
//        for (int i = 0; i < M; i++) {
//            String[] s = br.readLine().split(" ");
//            int X = Integer.parseInt(s[0]);
//            int Y = Integer.parseInt(s[1]);
//            int posX = -1;
//            int posY = -1;
//
//            for (int k = 0; k < 3; k++) {
//                if (arr[k]==X) posX = k;
//                if (arr[k]==Y) posY = k;
//            }
//            if (posX != -1 && posY != -1) {
//                int temp = arr[posX];
//                arr[posX] = arr[posY];
//                arr[posY] = temp;
//            }
//
////            int temp = arr[X-1];
////            arr[X-1] = arr[Y-1];
////            arr[Y-1] = temp;
//        }
//        System.out.println(arr[0]);
//    }
//}
