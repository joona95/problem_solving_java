package programmers.힙;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class 이중우선순위큐 {
    public static int[] solution(String[] operations) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (String operation : operations) {
            String[] op = operation.split(" ");
            if (op[0].equals("I")) {
                int num = Integer.parseInt(op[1]);
                minHeap.add(num);
                maxHeap.add(num);
            } else if (!minHeap.isEmpty() && !maxHeap.isEmpty()) {
                if (op[1].equals("-1")) {
                    int min = minHeap.poll();
                    maxHeap.remove(min);
                } else {
                    int max = maxHeap.poll();
                    minHeap.remove(max);
                }
            }
        }
        int[] answer = new int[2];
        if (!minHeap.isEmpty() && !maxHeap.isEmpty()) {
            answer[0] = maxHeap.peek();
            answer[1] = minHeap.peek();
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"})));
        System.out.println(Arrays.toString(solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"})));
    }
}
