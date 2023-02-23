package DFS_BFS;

import java.util.Scanner;

public class Problem_2_바둑이_승차_DFS {
    static int c, n, answer = Integer.MIN_VALUE;
    static int[] arr;

    static void DFS(int r, int sum) {
        if (sum > c) return;
        if (r == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(r + 1, sum + arr[r]);
            DFS(r + 1, sum);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        c = in.nextInt();
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        DFS(0, 0);
        System.out.println(answer);
    }
}
