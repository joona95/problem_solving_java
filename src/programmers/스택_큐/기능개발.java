package programmers.스택_큐;

import java.util.*;

public class 기능개발 {
    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int days = (100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] != 0 ? 1 : 0);
            queue.add(days);
        }

        List<Integer> answer = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            int days = queue.poll();
            if (max < days) {
                max = days;
                answer.add(1);
            } else {
                answer.set(answer.size() - 1, answer.get(answer.size() - 1) + 1);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
        System.out.println(Arrays.toString(solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));
    }
}
