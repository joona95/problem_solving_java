package programmers.입문.day17;

import java.util.Arrays;

public class OX퀴즈 {
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] s = quiz[i].split(" ");
            int n1 = Integer.parseInt(s[0]);
            int n2 = Integer.parseInt(s[2]);
            int r = Integer.parseInt(s[4]);
            String op = s[1];
            if ((op.equals("+") && n1 + n2 == r)
                    || (op.equals("-") && n1 - n2 == r)) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"})));
        System.out.println(Arrays.toString(solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})));
    }
}
