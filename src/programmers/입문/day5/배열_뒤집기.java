package programmers.입문.day5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 배열_뒤집기 {
    public static int[] solution(int[] num_list) {
        /*
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length - 1 - i];
        }
        return answer;

         */
        return IntStream.range(0, num_list.length).map(i -> num_list[num_list.length - 1 - i]).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 1, 1, 1, 2})));
        System.out.println(Arrays.toString(solution(new int[]{1, 0, 1, 1, 1, 3, 5})));
    }
}
