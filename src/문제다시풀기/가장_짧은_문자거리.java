package 문제다시풀기;

import java.util.Arrays;
import java.util.Scanner;

public class 가장_짧은_문자거리 {

    static int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        Arrays.fill(answer, 101);
        int index = s.indexOf(t);
        while (index != -1) {
            for (int i = 0; i < s.length(); i++) {
                answer[i] = Math.min(answer[i], Math.abs(i - index));
            }
            index = s.indexOf(t, index + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        char t = kb.next().charAt(0);
        for (int x : solution(s, t)) {
            System.out.print(x + " ");
        }
    }
}
