package 문제다시풀기;

import java.util.Scanner;

public class 숫자만_추출 {

    static int solution(String str) {
        /*
        String number = "";
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                number += c;
            }
        }
        return Integer.parseInt(number);
         */

        int answer = 0;
        for (char c : str.toCharArray()) {
            if (c >= 48 && c <=  57) {
                answer = answer * 10 + (c - 48);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
}
