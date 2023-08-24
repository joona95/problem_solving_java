package programmers.스택_큐;

import java.util.*;

public class 같은_숫자는_싫어 {
    public static int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        for (int num : arr) {
            if (answer.size() == 0 || answer.get(answer.size() - 1) != num)
                answer.add(num);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(solution(new int[]{4, 4, 4, 3, 3})));
    }
}
