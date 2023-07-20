package programmers.day20;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 뒤에서_5등까지 {
    public static int[] solution(int[] num_list) {
        return IntStream.of(num_list).sorted().limit(5).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{12, 4, 15, 46, 38, 1, 14})));
    }
}
