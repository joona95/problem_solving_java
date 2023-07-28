package programmers.입문.day3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 짝수는_싫어요 {
    public static int[] solution(int n) {
        return IntStream.iterate(1, i -> i <= n, i -> i + 2).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
        System.out.println(Arrays.toString(solution(15)));
    }
}
