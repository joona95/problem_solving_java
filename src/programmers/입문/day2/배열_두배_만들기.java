package programmers.입문.day2;

import java.util.Arrays;

public class 배열_두배_만들기 {
    public static int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(number -> number * 2).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 100, -99, 1, 2, 3})));
    }
}
