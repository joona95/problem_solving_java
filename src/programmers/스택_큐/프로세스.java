package programmers.스택_큐;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class 프로세스 {

    public static int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(i);
            pq.add(priorities[i]);
        }

        int answer = 0;
        while (!queue.isEmpty() && !pq.isEmpty()) {
            if (priorities[queue.peek()] == pq.peek()) {
                answer++;
                if (location == queue.peek()) {
                    break;
                }
                pq.poll();
                queue.poll();
            } else {
                int idx = queue.poll();
                queue.add(idx);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}
