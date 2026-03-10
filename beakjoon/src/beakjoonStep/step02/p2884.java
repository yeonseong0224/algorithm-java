package beakjoonStep.step02;

import java.util.Scanner;

public class p2884 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        int A = (H*60 + M)-45;
        /* 계산 중 A가 음수가 될수 있기 때문에
        아래같은 조건 코드를 넣어야함.
        * */
        if (A<0){
            A+=1440; // 0시 일 때 하루(1440분)을 더해주어야함.
        }
        int B = A/60;
        int C = A%60;



        System.out.println(B + " " + C);



    }
}
