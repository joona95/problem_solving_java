package 문제다시풀기;

import java.util.Scanner;

public class 대소문자_변환 {
    static String solution(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            if(Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            }
            else {
                answer += Character.toLowerCase(c);
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
