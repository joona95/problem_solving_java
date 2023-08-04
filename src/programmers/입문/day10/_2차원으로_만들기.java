package programmers.입문.day10;

import java.util.Arrays;

public class _2차원으로_만들기 {
    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        for (int i = 0; i < num_list.length; i++) {
            answer[i / n][i % n] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
        System.out.println(Arrays.deepToString(solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3)));
    }
}
