package programmers.입문.day25;

import java.util.Arrays;

public class 연속된_수의_합 {
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = (2 * total / num + 1 - num) / 2;
        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
        System.out.println(Arrays.toString(solution(5, 15)));
        System.out.println(Arrays.toString(solution(4, 14)));
        System.out.println(Arrays.toString(solution(5, 5)));
        System.out.println(Arrays.toString(solution(5, 0)));
    }
}
