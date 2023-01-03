package String;

import java.util.Scanner;

public class Problem_1_문자_찾기 {

    static int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        /*
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c)
                answer++;
        }
         */
        for (char x : str.toCharArray()) {
            if (x == c)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char c = in.next().charAt(0);
        int result = solution(str, c);
        System.out.println(result);
    }
}
