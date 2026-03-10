package solved.Bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class p4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String p = br.readLine();
        int pcount = 0;
        for (int i=0 ; i < p.length(); i++) {
            char c = p.charAt(i);
            if (c == 'h') {
                break;
            }
            pcount++;
        }
        String d = br.readLine();
        int dcount =0;
        for (int j=0 ; j < d.length(); j++) {
            char o = d.charAt(j);
            if (o == 'h') {
                break;
            }
            dcount++;
        }
        if (pcount >= dcount){
            System.out.println("go");
        }
        else{
            System.out.println("no");
        }


    }


}
