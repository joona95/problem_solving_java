package programmers.기초.day15;

import java.util.Arrays;

public class 조건에_맞게_수열_변환하기_1 {
    public static int[] solution(int[] arr) {
        return Arrays.stream(arr).map(j -> (j >= 50 && j % 2 == 0) ? j / 2 : ((j < 50 && j % 2 != 0) ? j * 2 : j))
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 100, 99, 98})));
    }
}
