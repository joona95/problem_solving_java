package programmers.입문.day19;

import java.util.Arrays;

public class 잘라서_배열로_저장하기 {
    public static String[] solution(String my_str, int n) {
        int idx = my_str.length() / n + (my_str.length() % n == 0 ? 0 : 1);
        String[] answer = new String[idx];
        for (int i = 0; i < idx; i++) {
            int start = i * n;
            int end = Math.min((i + 1) * n, my_str.length());
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc1Addfggg4556b", 6)));
        System.out.println(Arrays.toString(solution("abcdef123", 3)));
    }
}
