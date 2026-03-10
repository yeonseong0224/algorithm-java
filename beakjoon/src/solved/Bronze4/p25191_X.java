package solved.Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p25191_X {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");

        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);

//        int sum = 0;

        int maxChicken = A/2;
        int maxPizza = B;
        int result = Math.min(N, maxChicken+maxPizza);

//        while (N > 0 && (A >= 2 || B >= 1)) {
//            if (A >= 2 && N > 0) {
//                N -= 1;
//                A -= 2;
//                sum += 1;
//            }
//            if (B >= 1 && N > 0) {
//                N -= 1;
//                B -= 1;
//                sum += 1;
//            }
//        }
//        System.out.println(sum);
        System.out.println(result);
    }
}




