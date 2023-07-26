package programmers.기초.day12;

import java.util.stream.IntStream;

public class 첫_번째로_나오는_음수 {
    public static int solution(int[] num_list) {
        return IntStream.range(0, num_list.length).filter(i -> num_list[i] < 0).findFirst().orElse(-1);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{12, 4, 15, 46, 38, -2, 15}));
        System.out.println(solution(new int[]{13, 22, 53, 24, 15, 6}));
    }
}
