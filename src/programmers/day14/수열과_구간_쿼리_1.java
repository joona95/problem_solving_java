package programmers.day14;

import java.util.Arrays;

public class 수열과_구간_쿼리_1 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                answer[i]++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 2, 3, 4},
                new int[][]{{0, 1}, {1, 2}, {2, 3}})));
    }
}
