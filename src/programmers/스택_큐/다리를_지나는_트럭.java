package programmers.스택_큐;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를_지나는_트럭 {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {

        int answer = 0;
        int sum = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int truck : truck_weights) {
            while (true) {
                if (queue.isEmpty()) {
                    queue.add(truck);
                    sum += truck;
                    answer++;
                    break;
                } else if (queue.size() == bridge_length) {
                    sum -= queue.poll();
                } else {
                    if (sum + truck <= weight) {
                        queue.add(truck);
                        sum += truck;
                        answer++;
                        break;
                    } else {
                        queue.add(0);
                        answer++;
                    }
                }
            }
        }

        return answer + bridge_length;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 10, new int[]{7, 4, 5, 6}));
        System.out.println(solution(100, 100, new int[]{10}));
        System.out.println(solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
    }
}
