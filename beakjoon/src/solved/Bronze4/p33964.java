//// 25.06.21
//
//package solved.Bronze4;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class p33964 {
//    public static void main (String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int X = Integer.parseInt(br.readLine());
//        int Y = Integer.parseInt(br.readLine());
//
//        int[] arr1 = new int[X];
//        int[] arr2 = new int[Y];
//        int sum1 = 0;
//        int sum2 = 0;
//
//        for (int i = 0; i < X; i++) {
//            arr1[i] -= 1;
//            sum1 += arr1[i];
//            }
//        for (int i = 0; i < Y; i++) {
//            arr2[i] = 1;
//            sum2 += arr2[i];
//        }
//
//        System.out.println(sum1 + sum2);
//    }
//
//}
