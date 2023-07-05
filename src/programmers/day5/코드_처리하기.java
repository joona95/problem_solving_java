package programmers.day5;

import java.util.Scanner;

public class 코드_처리하기 {
    static public String solution(String code) {
        boolean mode = false;
        int length = code.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (code.charAt(i) == '1') {
                mode = !mode;
                continue;
            }
            if (!mode && i % 2 == 0) {
                sb.append(code.charAt(i));
                continue;
            }
            if (mode && i % 2 != 0) {
                sb.append(code.charAt(i));
            }
        }
        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();

        System.out.println(solution(code));
    }
}
