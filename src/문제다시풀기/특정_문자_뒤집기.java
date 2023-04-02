package 문제다시풀기;

import java.util.Scanner;

public class 특정_문자_뒤집기 {
    static String solution(String str) {
        char[] word = str.toCharArray();
        int s = 0, e = str.length() - 1;
        while(s < e) {
            if(!Character.isAlphabetic(str.charAt(s))) {
                s++;
                continue;
            }
            if(!Character.isAlphabetic(str.charAt(e))) {
                e--;
                continue;
            }
            char tmp = word[s];
            word[s] = word[e];
            word[e] = tmp;
            s++;
            e--;
        }
        return String.valueOf(word);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
}
