package programmers.완전탐색;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 전력량을_둘로_나누기 {

    public static int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        boolean[] visited = new boolean[n + 1];

        for (int i = 0; i < wires.length; i++) {

            List<Integer>[] tree = new ArrayList[n + 1];
            for (int j = 1; j <= n; j++) {
                tree[j] = new ArrayList<>();
            }

            for (int j = 0; j < wires.length; j++) {
                if (i != j) {
                    tree[wires[j][0]].add(wires[j][1]);
                    tree[wires[j][1]].add(wires[j][0]);
                }
            }

            for (int j = 1; j <= n; j++)
                visited[j] = false;

            Queue<Integer> queue = new LinkedList<>();
            queue.add(wires[i][0]);
            visited[wires[i][0]] = true;
            int cnt = 1;
            while (!queue.isEmpty()) {
                for (int element : tree[queue.poll()]) {
                    if (!visited[element]) {
                        queue.add(element);
                        cnt++;
                        visited[element] = true;
                    }
                }
            }

            answer = Math.min(answer, Math.abs(cnt - (n - cnt)));

        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(9, new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}}));
        System.out.println(solution(4, new int[][]{{1, 2}, {2, 3}, {3, 4}}));
        System.out.println(solution(7, new int[][]{{1, 2}, {2, 7}, {3, 7}, {3, 4}, {4, 5}, {6, 7}}));
    }
}
