package programmers.입문.day4;

import java.util.stream.IntStream;

public class 배열의_평균값 {
    public static double solution(int[] numbers) {
        return IntStream.of(numbers).average().getAsDouble();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }
}
