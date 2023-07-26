package programmers.기초.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열_만들기_6 {
    public static int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (answer.isEmpty() || answer.get(answer.size() - 1) != arr[i]) {
                answer.add(arr[i]);
            } else {
                answer.remove(answer.size() - 1);
            }
        }
        return answer.isEmpty() ? new int[]{-1} : answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 1, 1, 0})));
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 0, 1, 0})));
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 1, 0})));
    }
}
