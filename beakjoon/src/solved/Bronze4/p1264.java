// 25.06.21

package solved.Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (!(line = br.readLine()).equals("#")){
            int count =0;
            for (char c : line.toLowerCase().toCharArray()) {
                if ("aeiou".indexOf(c) != -1){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}


