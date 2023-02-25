package DFS_BFS;

import java.util.Scanner;

public class Problem_3_최대점수_구하기_DFS {
    static int n, m, answer = 0;
    static int[] scores, times;

    static void DFS(int r, int sum, int time) {
        if (time > m)
            return;
        if (r == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(r + 1, sum + scores[r], time + times[r]);
            DFS(r + 1, sum, time);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        scores = new int[n];
        times = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = in.nextInt();
            times[i] = in.nextInt();
        }
        DFS(0, 0, 0);
        System.out.println(answer);
    }
}
