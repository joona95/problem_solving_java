package String;

import java.util.Scanner;

public class Problem_2_대소문자_변환 {


    static String solution(String str) {
        String answer = "";
        /*
        for (char c : str.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                answer += (char) (c - 32);
            } else {
                answer += (char) (c + 32);
            }
        }
        */
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c))
                answer += Character.toUpperCase(c);
            else
                answer += Character.toLowerCase(c);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String answer = solution(str);
        System.out.println(answer);
    }
}
