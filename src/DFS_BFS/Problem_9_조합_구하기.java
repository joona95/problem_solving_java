package DFS_BFS;

import java.util.Scanner;

public class Problem_9_조합_구하기 {
    static int n, m;
    static int[] combi;

    static void DFS(int level, int s) {
        if (level == m) {
            for (int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                combi[level] = i;
                DFS(level + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        combi = new int[m];
        DFS(0, 1);
    }
}
