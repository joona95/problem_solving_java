package String;

import java.util.Scanner;

public class Problem_5_특정_문자_뒤집기 {
    static String solution(String str) {
        String answer = "";
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
                continue;
            }
            if (!Character.isAlphabetic(s[rt])) {
                rt--;
                continue;
            }
            char tmp = s[lt];
            s[lt] = s[rt];
            s[rt] = tmp;
            lt++;
            rt--;
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String result = solution(str);
        System.out.println(result);
    }
}
