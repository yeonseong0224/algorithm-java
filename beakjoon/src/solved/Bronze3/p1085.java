package solved.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] N = br.readLine().split(" ");
        int x = Integer.parseInt(N[0]);
        int y = Integer.parseInt(N[1]);
        int w = Integer.parseInt(N[2]);
        int h = Integer.parseInt(N[3]);

        int a = w-x;
        int b = h-y;

        int min = Math.min(Math.min(x,y),Math.min(a,b));
        System.out.println(min);

    }
}


