package programmers.day24;

import java.util.Arrays;

public class 특별한_이차원_배열_1 {
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        /*
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    answer[i][j] = 1;
                }
            }
        }
         */
        for(int i = 0 ; i < n ; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3)));
        System.out.println(Arrays.toString(solution(6)));
        System.out.println(Arrays.toString(solution(1)));
    }
}
