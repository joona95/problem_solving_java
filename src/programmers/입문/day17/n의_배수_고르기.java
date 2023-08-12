package programmers.입문.day17;

import java.util.Arrays;

public class n의_배수_고르기 {
    public static int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(num -> num % n == 0).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})));
        System.out.println(Arrays.toString(solution(5, new int[]{1, 9, 3, 10, 13, 5})));
        System.out.println(Arrays.toString(solution(12, new int[]{2, 100, 120, 600, 12, 12})));
    }
}
