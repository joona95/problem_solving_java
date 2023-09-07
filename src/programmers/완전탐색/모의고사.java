package programmers.완전탐색;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {
    public static int[] solution(int[] answers) {
        int[][] students = new int[][]{{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int max = 0;
        int[] scores = new int[students.length];
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (answers[j] == students[i][j % students[i].length]) {
                    scores[i]++;
                }
            }
            max = Math.max(max, scores[i]);
        }
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == max)
                answer.add(i + 1);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 2, 4, 2})));
    }
}
