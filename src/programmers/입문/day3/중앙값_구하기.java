package programmers.입문.day3;

import java.util.Arrays;

public class 중앙값_구하기 {
    public static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 7, 10, 11}));
        System.out.println(solution(new int[]{9, -1, 0}));
    }
}
