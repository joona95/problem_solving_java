package String;

import java.util.Scanner;

public class Problem_6_중복문자제거 {
    static String solution(String str) {
        String answer = "";
        /*
        boolean[] isAlphabetExist = new boolean[30];
        for(char c : str.toCharArray()) {
            if(!isAlphabetExist[c - 'a']) {
                answer += c;
                isAlphabetExist[c - 'a'] = true;
            }
        }
         */
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i)
                answer += str.charAt(i);
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
