package 문제다시풀기;

import java.util.Scanner;

public class 유효한_팰린드롬 {

    static String solution(String str) {
        str = str.toUpperCase();
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
            if(str.charAt(s) != str.charAt(e)) {
                return "NO";
            }
            s++;
            e--;
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));
    }
}
