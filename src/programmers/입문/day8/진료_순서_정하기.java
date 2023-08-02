package programmers.입문.day8;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class 진료_순서_정하기 {
    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] order = IntStream.of(emergency).boxed().sorted(Collections.reverseOrder()).mapToInt(i -> i).toArray();
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (order[i] == emergency[j]) {
                    answer[j] = i + 1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 76, 24})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6, 7})));
        System.out.println(Arrays.toString(solution(new int[]{30, 10, 23, 6, 100})));
    }
}
