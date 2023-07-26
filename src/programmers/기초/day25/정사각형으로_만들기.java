package programmers.기초.day25;

import java.util.Arrays;

public class 정사각형으로_만들기 {
    public static int[][] solution(int[][] arr) {
        int n = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < arr.length && j < arr[i].length) {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}})));
        System.out.println(Arrays.deepToString(solution(new int[][]{{57, 192, 534, 2}, {9, 345, 192, 999}})));
    }
}
