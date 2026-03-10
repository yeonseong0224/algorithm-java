package solved.Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] C = br.readLine().split(" ");
        int L = Integer.parseInt(C[0]);
        int P = Integer.parseInt(C[1]);

        String[] A = br.readLine().split(" ");
        int one = Integer.parseInt(A[0]);
        int two = Integer.parseInt(A[1]);
        int three = Integer.parseInt(A[2]);
        int four = Integer.parseInt(A[3]);
        int five = Integer.parseInt(A[4]);

        int person = L*P;
        System.out.println((one-person) + " " + (two-person)+ " " + (three-person)+ " "+(four-person) + " " + (five-person));





    }
}
