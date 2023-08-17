package programmers.입문.day23;

import java.util.Arrays;

public class 특이한_정렬 {
    public static int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
                .boxed()
                .sorted((num1, num2) -> Math.abs(num1 - n) == Math.abs(num2 - n) ? Integer.compare(num2, num1) : Integer.compare(Math.abs(num1 - n), Math.abs(num2 - n)))
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6}, 4)));
        System.out.println(Arrays.toString(solution(new int[]{10000, 20, 36, 47, 40, 6, 10, 7000}, 30)));
    }
}
