package String;

import java.util.Scanner;

public class Problem_11_문자열_압축 {
    static String solution(String str) {
        String answer = "";
        /*
        answer += str.charAt(0);
        int cnt = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                cnt++;
                continue;
            }
            if (cnt > 1) answer += cnt;
            answer += str.charAt(i);
            cnt = 1;
        }
        if (cnt > 1) answer += cnt;
         */
        str += " ";
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1))
                cnt++;
            else {
                answer += str.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String result = solution(str);
        System.out.println(result);
    }
}
