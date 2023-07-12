package programmers.day12;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 배열_만들기_3 {
    public static int[] solution(int[] arr, int[][] intervals) {
        return IntStream.range(0, intervals.length).flatMap(i -> Arrays.stream(Arrays.copyOfRange(arr, intervals[i][0], intervals[i][1] + 1))).toArray();
    }

    public static void main(String[] args) {
        for (int num : solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1, 3}, {0, 4}}))
            System.out.print(num + " ");
    }
}
