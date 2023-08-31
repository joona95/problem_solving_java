package programmers.힙;

import java.util.PriorityQueue;

public class 더_맵게 {
    public static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : scoville) {
            queue.add(num);
        }
        int answer = 0;
        while (queue.size() >= 2 && queue.stream().anyMatch(i -> i < K)) {
            int a = queue.poll();
            int b = queue.poll();
            int result = a + (b * 2);
            queue.add(result);
            answer++;
        }
        if (queue.stream().anyMatch(i -> i < K))
            return -1;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }
}
