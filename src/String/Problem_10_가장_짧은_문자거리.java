package String;

import java.util.Scanner;

public class Problem_10_가장_짧은_문자거리 {
    static int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        /*
        Arrays.fill(answer, 101);
        int index = s.indexOf(t);
        while (index != -1) {
            for (int i = 0; i < s.length(); i++) {
                answer[i] = Math.min(answer[i], Math.abs(i - index));
            }
            index = s.indexOf(t, index + 1);
        }
         */
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t)
                p = 0;
            else
                p++;
            answer[i] = p;
        }
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t)
                p = 0;
            else
                p++;
            answer[i] = Math.min(answer[i], p);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char t = in.next().charAt(0);
        int[] result = solution(s, t);
        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}
