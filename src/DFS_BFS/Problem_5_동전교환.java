package DFS_BFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem_5_동전교환 {
    static int n, m, answer = Integer.MAX_VALUE;

    static void DFS(int level, int sum, Integer[] arr) {
        if (sum > m) return;
        if (level >= answer) return;
        if (sum == m) {
            answer = Math.min(answer, level);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(level + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m = in.nextInt();
        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
