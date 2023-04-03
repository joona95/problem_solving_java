package 문제다시풀기;

import java.util.Scanner;

public class 중복문자제거 {
    static String solution(String str) {
        String answer = "";
        /*
        int[] check = new int[30];
        for (char c : str.toCharArray()) {
            if(check[c - 'a'] == 0) {
                answer += c;
                check[c - 'a'] = 1;
            }
        }
         */
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
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
