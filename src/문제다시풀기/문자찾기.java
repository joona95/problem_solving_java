package 문제다시풀기;

import java.util.Scanner;

public class 문자찾기 {
    /*
    static int solution(String str, String s) {
        int answer = 0;
        for(int i=0;i<str.length();i++) {
            if(s.equalsIgnoreCase(Character.toString(str.charAt(i)))) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        String s = kb.next();
        System.out.println(solution(str, s));
    }
     */

    static int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        for(char s : str.toCharArray()) {
            if(s == c) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(solution(str, c));
    }
}
