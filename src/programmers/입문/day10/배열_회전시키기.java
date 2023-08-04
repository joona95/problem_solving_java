package programmers.입문.day10;

import java.util.Arrays;

public class 배열_회전시키기 {
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if (direction.equals("right")) {
            answer[0] = numbers[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++)
                answer[i + 1] = numbers[i];
        } else {
            answer[numbers.length - 1] = numbers[0];
            for (int i = 1; i < numbers.length; i++)
                answer[i - 1] = numbers[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3}, "right")));
        System.out.println(Arrays.toString(solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left")));
    }
}
