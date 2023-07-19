package programmers.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 빈_배열에_추가_삭제하기 {
    public static int[] solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    answer.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    answer.remove(answer.size() - 1);
                }
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 2, 4, 1, 3}, new boolean[]{true, false, true, false, false})));
    }
}
