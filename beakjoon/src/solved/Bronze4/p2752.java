package solved.Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);


    int[] arr = new int[3];
    arr[0] = A;
    arr[1] = B;
    arr[2] = C;

    for (int i  = 0; i < 3; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr [j+1] = arr[j];   // arr 배열의 (j+1)번째 위치에, j번째에 있는 값을 복사해 넣어라
            j--;
        }
        arr[j+1] = key;
    }

    System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

    }
}
