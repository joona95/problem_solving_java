package programmers.기초.day11;

import java.util.stream.IntStream;

public class 가까운_1_찾기 {
    public static int solution(int[] arr, int idx) {
        /*
        int answer = -1;
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            }
        }
        return answer;

         */
        return IntStream.range(idx, arr.length).filter(i -> arr[i] == 1).findFirst().orElse(-1);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 0, 0, 1}, 1));
        System.out.println(solution(new int[]{1, 0, 0, 1, 0, 0}, 4));
        System.out.println(solution(new int[]{1, 1, 1, 1, 0}, 3));
    }
}
