package 문제다시풀기;

import java.util.Scanner;

public class 문자열_압축 {
    static String solution(String str) {
        String answer = "";
        char c = str.charAt(0);
        int cnt = 1;
        for (int i=1;i<str.length();i++) {
            if(c != str.charAt(i)) {
                answer += c;
                if(cnt > 1)
                    answer += Integer.toString(cnt);
                c = str.charAt(i);
                cnt = 1;
            }
            else {
                cnt++;
            }
        }
        answer+=c;
        answer+=Integer.toString(cnt);
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
}
