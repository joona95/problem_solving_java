package programmers.기초.day23;

import java.util.stream.IntStream;

public class 정수_찾기 {
    public static int solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length).anyMatch(i -> num_list[i] == n) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,5}, 3));
        System.out.println(solution(new int[]{15,98,23,2,15}, 20));
    }
}
