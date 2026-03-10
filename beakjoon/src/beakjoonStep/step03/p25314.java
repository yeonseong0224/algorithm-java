package beakjoonStep.step03;

import java.util.Scanner;

public class p25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long num = N/4;
        String result = "";

        for (int i=0; i< num; i++){
            result += "long ";
        }

        System.out.println(result + "int");


    }
}


/*
String result = ""; 의미
result라는 문자열 변수를 "초기화" 하는 거야.
즉, 처음에 아무것도 없는 빈 문자열("")로 만들어 놓는 것.
왜 초기화해야 돼?
이유는 간단해:
for문 안에서 result에 값을 계속 추가(+=) 해야 하는데
result가 처음에 아예 없으면 (null 같은 상태면)
추가(+) 자체를 할 수 없고 오류가 나버려!
 */