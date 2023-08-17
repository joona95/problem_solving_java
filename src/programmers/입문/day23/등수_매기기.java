package programmers.입문.day23;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 등수_매기기 {

    public static int[] solution(int[][] score) {
        double[][] rank = new double[score.length][2];
        for (int i = 0; i < score.length; i++) {
            rank[i][0] = ((double) score[i][0] + score[i][1]) / 2;
            rank[i][1] = i;
        }
        Arrays.sort(rank, (r1, r2) -> Double.compare(r2[0], r1[0]));

        List<Double> averageScore = Arrays.stream(rank).map(r -> r[0]).collect(Collectors.toList());
        int[] answer = new int[score.length];
        for(int i=0;i<rank.length;i++) {
            answer[(int)rank[i][1]] = averageScore.indexOf(rank[i][0]) + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}})));
        System.out.println(Arrays.toString(solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}})));
        System.out.println(Arrays.toString(solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}})));
        System.out.println(Arrays.toString(solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}})));
        System.out.println(Arrays.toString(solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}})));
    }
}
