import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p1284_X {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();

            // 입력이 "0"이면 종료
            if (s.equals("0")) {
                break;
            }

            int sum = 1; // 호수판의 처음과 끝 여백 1mm

            // 문자열을 순회하며 각 숫자에 필요한 너비 계산
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (ch == '1') {
                    sum += 2; // 숫자 1은 2mm
                } else if (ch == '0') {
                    sum += 4; // 숫자 0은 4mm
                } else {
                    sum += 3; // 그 외 숫자는 3mm
                }

                sum += 1; // 숫자 사이의 여백 1mm
            }

            System.out.println(sum);
        }
    }
}