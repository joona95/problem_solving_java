package 문제다시풀기;

import java.util.Scanner;

public class 회문_문자열 {

    static String solution(String str) {

        str = str.toUpperCase();
        for(int i=0;i<str.length()/2;i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                return "NO";
            }
        }
         /*
        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)) {
            return "NO";
        }
          */
        return "YES";
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
}
