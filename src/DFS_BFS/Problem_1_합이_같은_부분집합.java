package DFS_BFS;

import java.util.Scanner;

public class Problem_1_합이_같은_부분집합 {
    static int n, total = 0;
    static String answer = "NO";
    static boolean flag = false;

    static void DFS(int level, int sum, int[] arr) {
        if (flag)
            return;
        if (sum > total / 2)
            return;
        if (level == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(level + 1, sum + arr[level], arr);
            DFS(level + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            total += arr[i];
        }
        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
