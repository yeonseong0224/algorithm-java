package solved.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p1247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i=0; i<3; i++) {
            int N = Integer.parseInt(br.readLine());
            BigInteger sum = BigInteger.ZERO;   // 미리 준비한 0 객체를 씀

            for (int j=0; j<N; j++) {
                BigInteger num = new BigInteger(br.readLine());
                sum = sum.add(num);
            }
            int cmp = sum.signum();

            if (cmp>0){
                System.out.println("+");
            } else if (cmp==0){
                System.out.println("0");
            } else {
                System.out.println("-");
            }
        }



        // long으로 하면 정수의 크기 제한이 걸림 -> 오버플로우
//        for (int i=0; i<3; i++){
//            int N = Integer.parseInt(br.readLine());
//            long S = 0;
//
//            for (int j=0; j<N; j++){
//                long M = Long.parseLong(br.readLine());
//                S += M;
//            }
//
//            if (S<0){
//                System.out.println("-");
//            } else if (S==0){
//                System.out.println("0");
//            } else {
//                System.out.println("+");
//            }
//        }
    }
}
