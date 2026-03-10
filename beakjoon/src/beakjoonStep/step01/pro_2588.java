package beakjoonStep.step01;

import java.util.Scanner;

public class pro_2588 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();  // 첫 번째 수 (예: 472)
            int b = sc.nextInt();  // 두 번째 수 (예: 385)

            int one = b % 10;            // 1의 자리
            int ten = (b / 10) % 10;     // 10의 자리
            int hundred = b / 100;       // 100의 자리

            System.out.println(a * one);     // 472 × 5 = 2360
            System.out.println(a * ten);     // 472 × 8 = 3776
            System.out.println(a * hundred); // 472 × 3 = 1416
            System.out.println(a * b);       // 472 × 385 = 181720
        }
    }




